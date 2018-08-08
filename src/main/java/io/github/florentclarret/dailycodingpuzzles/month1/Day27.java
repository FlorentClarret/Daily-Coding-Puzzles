package io.github.florentclarret.dailycodingpuzzles.month1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * You have a group chat application, but who is online!?
 * <p>
 * You want to show your users which of their friends are online and available to chat!
 * <p>
 * Given an input of an array of objects containing usernames, status and time since last activity (in mins), create a function to work out who is online, offline and away.
 * <p>
 * If someone is online but their lastActivity was more than 10 minutes ago they are to be considered away.
 * <p>
 * The input data has the following structure:
 * <p>
 * [{
 * username: 'David',
 * status: 'online',
 * lastActivity: 10
 * }, {
 * username: 'Lucy',
 * status: 'offline',
 * lastActivity: 22
 * }, {
 * username: 'Bob',
 * status: 'online',
 * lastActivity: 104
 * }]
 * <p>
 * The corresponding output should look as follows:
 * <p>
 * {
 * online: ['David'],
 * offline: ['Lucy'],
 * away: ['Bob']
 * }
 * <p>
 * If for example, no users are online the output should look as follows:
 * <p>
 * {
 * offline: ['Lucy'],
 * away: ['Bob']
 * }
 * <p>
 * username will always be a string, status will always be either 'online' or 'offline' and lastActivity will always be number >= 0.
 */
public class Day27 {

    public enum Status {
        @JsonProperty("online") ONLINE,
        @JsonProperty("offline") OFFLINE,
        @JsonProperty("away") AWAY
    }

    @JsonPropertyOrder(alphabetic = true)
    public static final class User {
        private String username;

        private Status status;

        private long lastActivity;

        public String getUsername() {
            return username;
        }

        public void setUsername(final String username) {
            this.username = username;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(final Status status) {
            this.status = status;
        }

        public long getLastActivity() {
            return lastActivity;
        }

        public void setLastActivity(final long lastActivity) {
            this.lastActivity = lastActivity;
        }
    }

    @JsonPropertyOrder(alphabetic = true)
    public static final class Output {
        private List<String> away = new ArrayList<>();
        private List<String> online = new ArrayList<>();
        private List<String> offline = new ArrayList<>();

        public List<String> getAway() {
            return away;
        }

        public void setAway(final List<String> away) {
            this.away = away;
        }

        public List<String> getOnline() {
            return online;
        }

        public void setOnline(final List<String> online) {
            this.online = online;
        }

        public List<String> getOffline() {
            return offline;
        }

        public void setOffline(final List<String> offline) {
            this.offline = offline;
        }

        public boolean addUser(final User user) {
            switch (user.getStatus()) {
                case AWAY:
                    return away.add(user.getUsername());
                case OFFLINE:
                    return offline.add(user.getUsername());
                case ONLINE:
                    return online.add(user.getUsername());
                default:
                    return false;
            }
        }
    }

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static String getStatuses(final String input) throws IOException {
        final List<User> users = MAPPER.readValue(input, new TypeReference<List<User>>() {
        });
        final Output output = new Output();

        for (final User user : users) {
            if (user.getStatus() == Status.ONLINE && user.getLastActivity() > 10) {
                user.setStatus(Status.AWAY);
            }
            output.addUser(user);
        }

        return MAPPER.writeValueAsString(output);
    }

}
