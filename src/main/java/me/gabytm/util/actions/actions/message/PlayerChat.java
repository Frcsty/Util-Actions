package me.gabytm.util.actions.actions.message;

import me.gabytm.util.actions.Action;
import org.bukkit.entity.Player;

public class PlayerChat implements Action {

    @Override
    public String getID() {
        return "chat";
    }

    @Override
    public void run(Player player, String data) {
        player.chat(data);
    }
}
