package com.slack.api.methods.request.conversations;

import com.slack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConversationsCreateRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `conversations:write`
     */
    private String token;

    /**
     * Name of the public or private channel to create
     */
    private String name;

    /**
     * Create a private channel instead of a public one
     */
    private boolean isPrivate;

}
