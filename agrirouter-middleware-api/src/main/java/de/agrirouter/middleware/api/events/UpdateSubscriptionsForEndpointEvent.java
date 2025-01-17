package de.agrirouter.middleware.api.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * This event will be thrown if the subscriptions for the endpoint should be updated.
 */
@Getter
public class UpdateSubscriptionsForEndpointEvent extends ApplicationEvent {

    /**
     * The ID of the endpoint to update the subscriptions for.
     */
    private final String internalEndpointId;

    public UpdateSubscriptionsForEndpointEvent(Object source, String internalEndpointId) {
        super(source);
        this.internalEndpointId = internalEndpointId;
    }

}
