package com.huanglanmu.sk;

import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.ServerPlayer;
import moddedmite.rustedironcore.api.event.Handlers;
import moddedmite.rustedironcore.api.event.events.PlayerLoggedInEvent;
import moddedmite.rustedironcore.api.event.listener.IPlayerEventListener;

public class SKEventListener extends Handlers {

    public static void register() {

        PlayerEvent.register(new IPlayerEventListener() {

            @Override
            public void onPlayerLoggedIn(PlayerLoggedInEvent event) {

                ServerPlayer player = event.player();

                if (player == null) return;

                if (!event.firstLogin()) return;

                ItemStack helmetStack = new ItemStack(Item.helmetLeather, 1, 0);
                player.inventory.addItemStackToInventory(helmetStack);

                ItemStack chestplateStack = new ItemStack(Item.plateLeather, 1, 0);
                player.inventory.addItemStackToInventory(chestplateStack);

                ItemStack breadStack = new ItemStack(Item.bread, 8, 0);
                player.inventory.addItemStackToInventory(breadStack);

                ItemStack bowlSaladStack = new ItemStack(Item.bowlSalad, 1, 0);
                player.inventory.addItemStackToInventory(bowlSaladStack);

                ItemStack  knifeRustedIronStack = new ItemStack(Item.knifeRustedIron, 1, 0);
                player.inventory.addItemStackToInventory(knifeRustedIronStack);
            }
        });
    }
}