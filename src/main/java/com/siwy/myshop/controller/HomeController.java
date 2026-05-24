package com.siwy.myshop.controller;

import com.siwy.myshop.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
        static List<Item> items = new ArrayList<Item>();

        static {
                new Item( "Klawiatura", new BigDecimal( "50" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" );
                new Item( "Klawiatura", new BigDecimal( "60" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" );
                new Item( "Klawiatura", new BigDecimal( "70" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" );
        }

        @GetMapping( "/" )
//        @ResponseBody
        public String home( Model model ) {
//                model.addAttribute( "item", new Item( "Klawiatura", new BigDecimal( "50" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" ) );
                model.addAttribute( "items", items );
                return "home";
//                return new Item("Klawiatura", new BigDecimal( "50" ),"https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp?v=1696159078" );
        }
}
