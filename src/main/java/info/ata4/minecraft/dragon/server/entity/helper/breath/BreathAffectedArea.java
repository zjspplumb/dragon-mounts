package info.ata4.minecraft.dragon.server.entity.helper.breath;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.*;
import net.minecraft.world.World;

import java.util.*;

/**
 * Created by TGG on 30/07/2015.
 * BreathAffectedArea base class
 - generated by BreedHelper
 - stores the area of effect; called every tick with the breathing direction; applies the effects of the breath weapon
 - derived classes for each type of breath
 Ctor
 - update (not breathing) or update(start, finish)
 - affectBlock for each block
 - affectEntity for each entity
 */
public abstract class BreathAffectedArea
{

  public void updateTickBreathing(Vec3 origin, Vec3 destination) {

  }

  public void updateTickNotBreathing() {

  }


  private void drawBreathNode(HashSet<BlockPos> blocksInBeam, HashSet<Integer> entitiesInBeam, Vec3 origin, Vec3 direction, float distance)
  {

  }

  private void moveNode()
  {

  }

  private void compileAffected(World world, List<LineSegment> lineSegments,
                               HashSet<BlockPos> affectedBlocks, HashSet<Integer> affectedEntities)
  {
    ArrayList<LineSegment> xLowSorted = LineSegment.deepCopy(lineSegments);
    LineSegment.sort(xLowSorted, LineSegment.SortOrder.X_LOW);

    ArrayList<LineSegment> xHighSorted = LineSegment.deepCopy(xLowSorted);
    LineSegment.sort(xHighSorted, LineSegment.SortOrder.X_HIGH);

    ArrayList<LineSegment> yLowSorted = LineSegment.deepCopy(xHighSorted);
    LineSegment.sort(yLowSorted, LineSegment.SortOrder.Y_LOW);

    ArrayList<LineSegment> yHighSorted = LineSegment.deepCopy(yLowSorted);
    LineSegment.sort(yHighSorted, LineSegment.SortOrder.Y_HIGH);

    ArrayList<LineSegment> zLowSorted = LineSegment.deepCopy(yHighSorted);
    LineSegment.sort(zLowSorted, LineSegment.SortOrder.Z_LOW);

    ArrayList<LineSegment> zHighSorted = LineSegment.deepCopy(zLowSorted);
    LineSegment.sort(zHighSorted, LineSegment.SortOrder.Z_HIGH);

    TO DO:

    MOVE THROUGH BLOCKS AROUND EACH SEGMEN

          FORM A FULL AABB AROUND ALL SEGMENTS
          SEARCH ALL ENTITIES AGAINST LINE SEGMETNS

  }
  private HashSet<BlockPos>;
  private HashSet<Integer>;

  private LinkedList<EntityBreathNodeServer> breathNodes;



}
