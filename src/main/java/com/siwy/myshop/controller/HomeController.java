package com.siwy.myshop.controller;

import com.siwy.myshop.model.Item;
import com.siwy.myshop.repository.ItemRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
        private final ItemRepository itemRepository;

        @Autowired
        public HomeController( ItemRepository itemRepository ) {
                this.itemRepository = itemRepository;
        }

        @GetMapping( "/" )
        public String home( Model model ) {
                List<Item> items = itemRepository.findAll();
                model.addAttribute( "items", items );

                return "home";
        }

        @GetMapping( "/add/{itemId}" )
        public String addItemToCart( @PathVariable Long itemId, Model model, HttpSession session ) {
                @SuppressWarnings( "unchecked" )
                List<Item> cart = (List<Item>)session.getAttribute( "cart" );
                if( cart == null )
                        cart = new ArrayList<>();

                Optional<Item> optionalItem = itemRepository.findById( itemId );
                if( optionalItem.isPresent() ) {
                        Item item = optionalItem.get();
                        cart.add( item );
                        session.setAttribute( "cart", cart );
                }

                return home( model );
        }

        @GetMapping( "/cartView" )
        public String goToCartView( Model model ) {
                return home( model );
        }
}
