package me.bermine.strikeparties.hook;

import org.bukkit.entity.Player;

import java.util.List;

public interface PartyAdapter {

    Player getLeader(Player player);

    List<Player> getMembers(Player player);
}
