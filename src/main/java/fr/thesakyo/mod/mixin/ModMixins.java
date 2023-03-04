package fr.thesakyo.mod.mixin;

import fr.thesakyo.mod.ModTest;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(TitleScreen.class)
public class ModMixins {

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        ModTest.LOGGER.info("Cette ligne est imprimée par un exemple de mod mixin !");
    }
}
