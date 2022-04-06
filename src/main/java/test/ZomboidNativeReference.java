package test;

import fmod.fmod.EmitterType;
import fmod.fmod.FMODAudio;
import fmod.fmod.FMODSoundBank;
import fmod.fmod.FMODSoundEmitter;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.lwjglx.input.Keyboard;
import se.krka.kahlua.vm.KahluaUtil;
import zombie.*;
import zombie.Lua.LuaEventManager;
import zombie.Lua.LuaManager;
import zombie.Lua.MapObjects;
import zombie.ai.GameCharacterAIBrain;
import zombie.ai.MapKnowledge;
import zombie.ai.sadisticAIDirector.SleepingEvent;
import zombie.ai.states.*;
import zombie.audio.*;
import zombie.characterTextures.BloodBodyPartType;
import zombie.characterTextures.BloodClothingType;
import zombie.characters.AttachedItems.*;
import zombie.characters.BodyDamage.*;
import zombie.characters.*;
import zombie.characters.CharacterTimedActions.LuaTimedAction;
import zombie.characters.CharacterTimedActions.LuaTimedActionNew;
import zombie.characters.Moodles.Moodle;
import zombie.characters.Moodles.MoodleType;
import zombie.characters.Moodles.Moodles;
import zombie.characters.WornItems.*;
import zombie.characters.professions.ProfessionFactory;
import zombie.characters.skills.PerkFactory;
import zombie.characters.traits.ObservationFactory;
import zombie.characters.traits.TraitCollection;
import zombie.characters.traits.TraitFactory;
import zombie.chat.ChatBase;
import zombie.chat.ChatMessage;
import zombie.chat.ChatTab;
import zombie.chat.ServerChatMessage;
import zombie.config.*;
import zombie.core.*;
import zombie.core.fonts.AngelCodeFont;
import zombie.core.logger.ZLogger;
import zombie.core.math.PZMath;
import zombie.core.properties.PropertyContainer;
import zombie.core.skinnedmodel.advancedanimation.debug.AnimatorDebugMonitor;
import zombie.core.skinnedmodel.population.*;
import zombie.core.skinnedmodel.visual.HumanVisual;
import zombie.core.skinnedmodel.visual.ItemVisual;
import zombie.core.skinnedmodel.visual.ItemVisuals;
import zombie.core.stash.Stash;
import zombie.core.stash.StashBuilding;
import zombie.core.stash.StashSystem;
import zombie.core.textures.ColorInfo;
import zombie.core.textures.Texture;
import zombie.core.znet.SteamFriend;
import zombie.core.znet.SteamUGCDetails;
import zombie.core.znet.SteamWorkshopItem;
import zombie.debug.BooleanDebugOption;
import zombie.debug.DebugLog;
import zombie.debug.DebugOptions;
import zombie.debug.DebugType;
import zombie.erosion.ErosionConfig;
import zombie.erosion.ErosionMain;
import zombie.erosion.season.ErosionSeason;
import zombie.gameStates.*;
import zombie.globalObjects.*;
import zombie.input.GameKeyboard;
import zombie.input.Mouse;
import zombie.inventory.*;
import zombie.inventory.types.*;
import zombie.iso.*;
import zombie.iso.SpriteDetails.IsoFlagType;
import zombie.iso.SpriteDetails.IsoObjectType;
import zombie.iso.areas.IsoBuilding;
import zombie.iso.areas.IsoRoom;
import zombie.iso.areas.NonPvpZone;
import zombie.iso.areas.SafeHouse;
import zombie.iso.areas.isoregion.IsoRegionLogType;
import zombie.iso.areas.isoregion.IsoRegions;
import zombie.iso.areas.isoregion.IsoRegionsLogger;
import zombie.iso.areas.isoregion.IsoRegionsRenderer;
import zombie.iso.areas.isoregion.data.DataCell;
import zombie.iso.areas.isoregion.data.DataChunk;
import zombie.iso.areas.isoregion.regions.IsoChunkRegion;
import zombie.iso.areas.isoregion.regions.IsoWorldRegion;
import zombie.iso.objects.*;
import zombie.iso.objects.interfaces.BarricadeAble;
import zombie.iso.sprite.IsoSprite;
import zombie.iso.sprite.IsoSpriteGrid;
import zombie.iso.sprite.IsoSpriteInstance;
import zombie.iso.sprite.IsoSpriteManager;
import zombie.iso.weather.*;
import zombie.iso.weather.fog.ImprovedFog;
import zombie.iso.weather.fx.IsoWeatherFX;
import zombie.modding.ActiveMods;
import zombie.network.*;
import zombie.network.packets.hit.Vehicle;
import zombie.popman.ZombiePopulationManager;
import zombie.popman.ZombiePopulationRenderer;
import zombie.radio.ChannelCategory;
import zombie.radio.RadioAPI;
import zombie.radio.RadioData;
import zombie.radio.StorySounds.*;
import zombie.radio.ZomboidRadio;
import zombie.radio.devices.DeviceData;
import zombie.radio.devices.DevicePresets;
import zombie.radio.devices.PresetEntry;
import zombie.radio.media.MediaData;
import zombie.radio.media.RecordedMedia;
import zombie.radio.scripting.*;
import zombie.randomizedWorld.RandomizedWorldBase;
import zombie.randomizedWorld.randomizedBuilding.*;
import zombie.randomizedWorld.randomizedDeadSurvivor.*;
import zombie.randomizedWorld.randomizedVehicleStory.*;
import zombie.randomizedWorld.randomizedZoneStory.*;
import zombie.scripting.ScriptManager;
import zombie.scripting.objects.*;
import zombie.ui.*;
import zombie.util.PZCalendar;
import zombie.util.list.PZArrayList;
import zombie.vehicles.*;
import zombie.world.moddata.ModData;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ZomboidNativeReference {


}