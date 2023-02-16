package com.gigabitwize.conversations.api.clause;

import net.kyori.adventure.text.Component;

/**
 * Created by Giovanni on 2/8/2023
 */
public interface Clause {

    /**
     * Returns whether this clause has been triggered or not.
     */
    boolean hasBeenTriggered();

    /**
     * Returns the message that gets displayed when this clause is triggered.
     */
    Component getTriggerMessage();

    interface Ticking extends Clause {

        void tick();
    }
}
