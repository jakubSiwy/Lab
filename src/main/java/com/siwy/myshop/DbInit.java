package com.siwy.myshop;

import com.siwy.myshop.model.Item;
import com.siwy.myshop.repository.ItemRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DbInit implements CommandLineRunner {
        private final ItemRepository itemRepository;

        public DbInit( ItemRepository ir ) {
                this.itemRepository = ir;
        }

        @Override
        public void run( String @NonNull ... args ) {
                itemRepository.saveAll( List.of(
                        new Item( "Klawiatura", new BigDecimal( "50" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "60" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "70" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "80" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "90" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "100" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "110" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "120" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "130" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "140" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "150" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" ),
                        new Item( "Klawiatura", new BigDecimal( "160" ), "https://www.moergo.com/cdn/shop/files/IMG_0216-1-square_0e6584fc-e513-4052-89c9-54c004d73dc5_1200x.webp" )
                ) );
        }
}
