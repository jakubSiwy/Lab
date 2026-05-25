package com.siwy.myshop.controller;

import com.siwy.myshop.model.Item;
import com.siwy.myshop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    //        static List<Item> items = new ArrayList<Item>();
//
//        static {
//                new Item( "Klawiatura", new BigDecimal( "50" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" );
//                new Item( "Klawiatura", new BigDecimal( "60" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" );
//                new Item( "Klawiatura", new BigDecimal( "70" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" );
//        }
    private final ItemRepository itemRepository;

    @Autowired
    public HomeController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/")
//        @ResponseBody
    public String home(Model model) {
//                model.addAttribute( "item", new Item( "Klawiatura", new BigDecimal( "50" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" ) );
        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "home";
//                return new Item("Klawiatura", new BigDecimal( "50" ),"https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" );
    }
}
