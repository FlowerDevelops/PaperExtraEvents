package io.papermc.paper.event.player;

import org.bukkit.advancement.Advancement;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * An event fired when a {@link Player} has an advancement revoked
 */
@NullMarked
public final class PlayerAdvancementCriterionRevokeEvent extends Event {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Player player;
    private final Advancement advancement;
    private final String criterion;

    @ApiStatus.Internal
    public PlayerAdvancementCriterionRevokeEvent(final Player player, Advancement advancement, String criterion) {
        this.player = player;
        this.advancement = advancement;
        this.criterion = criterion;
    }

    public Player getPlayer()
    {
        return this.player;
    }

    public Advancement getAdvancement() {
        return this.advancement;
    }

    public String getCriterion() {
        return this.criterion;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
