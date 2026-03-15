package com.huanglanmu.sk;


import net.fabricmc.api.ModInitializer;

public class StarterKit implements ModInitializer {
    @Override
    public void onInitialize() {
        // 注册事件监听器
        SKEventListener.register();
    }
}