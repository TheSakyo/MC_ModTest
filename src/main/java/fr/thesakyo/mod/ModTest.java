package fr.thesakyo.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModTest implements ModInitializer {

    // Ce collecteur est utilisé pour écrire du texte dans la console et dans le fichier journal.
	// Il est recommandé d'utiliser l'identifiant de votre mod comme nom du logger.
	// De cette façon, il est clair quel mod a écrit les informations, les avertissements et les erreurs.
	public static final Logger LOGGER = LoggerFactory.getLogger("thesakyo_mod");

    // Instanciation des Items //
    public static final Item HeartCookedITEM = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16)
                    .food(new FoodComponent.Builder().hunger(5).saturationModifier(4f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20*5), 0.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*8), 0.7f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*10), 0.8f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 20*15), 0.2f).build()));

                                /* --------------------- */
                                
    public static final Item HeartITEM = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16)
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(8f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*35), 0.8f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*25), 0.7f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 20*20), 0.6f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20*55), 0.2f).build()));

                            /* ------------------------------ */

    // Instanciation des Items //

    @Override
    public void onInitialize() {

        // Enregistrement des Items //

        Registry.register(Registry.ITEM, new Identifier("thesakyo_mod", "heart"), HeartITEM);
        Registry.register(Registry.ITEM, new Identifier("thesakyo_mod", "heart_cooked"), HeartCookedITEM);

        // Enregistrement des Items //
    }
}
