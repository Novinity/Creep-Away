package com.github.novinity.creeperrepellent;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CreeperRepellent.MODID)
public class CreeperRepellent {
    public static final String MODID = "creeperrepellent";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreeperRepellent() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
