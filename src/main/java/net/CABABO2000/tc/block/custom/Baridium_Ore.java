package net.CABABO2000.tc.block.custom;

import com.google.common.hash.Hashing;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

import java.util.concurrent.TimeUnit;

public class Baridium_Ore extends Block {
    public Baridium_Ore(Properties properties) {
        super(properties);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {

        if (!level.isClientSide) {
            player.hurt(new DamageSource("magic"), 18);
        }

        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }


}
