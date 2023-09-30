package org.example;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

public class YourBot {
    private final ShardManager shardManager;
    public YourBot(){
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(Secret.TOKEN);
        builder.setStatus(OnlineStatus.IDLE);
        builder.setActivity(Activity.playing("Testing :D"));
        shardManager = builder.build();
    }
    public ShardManager getShardManager() {
        return shardManager;
    }

    public static void main(String[] args) {
        YourBot yourBot = new YourBot();
    }
}
