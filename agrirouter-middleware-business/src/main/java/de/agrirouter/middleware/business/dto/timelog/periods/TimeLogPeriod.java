package de.agrirouter.middleware.business.dto.timelog.periods;

import lombok.Getter;

import java.util.Set;
import java.util.UUID;

/**
 * A dedicated time log period.
 */
@Getter
public class TimeLogPeriod {

    /**
     * The internal ID to reference the search results.
     */
    private final String id;

    /**
     * Begin of the period.
     */
    private final long begin;

    /**
     * End of the period.
     */
    private final long end;

    /**
     * Number Time logs within a period.
     */
    private final int nrOfTimeLogs;

    /**
     * The message IDs for this period.
     */
    private final Set<String> messageIds;

    public TimeLogPeriod(long begin, long end, int nrOfTimeLogs, Set<String> messageIds) {
        id = UUID.randomUUID().toString();
        this.begin = begin;
        this.end = end;
        this.nrOfTimeLogs = nrOfTimeLogs;
        this.messageIds = messageIds;
    }
}
