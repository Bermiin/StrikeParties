package me.bermine.strikeparties.hook.impl;

import me.bermine.strikeparties.hook.PartyAdapter;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;

public class DefaultProvider implements PartyAdapter {

    @Override
    public Player getLeader(Player player) {
        return null;
    }

    @Override
    public List<Player> getMembers(Player player) {
        return Collections.emptyList();
    }
}
