package widecat.itemframedupe.addon;

import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import widecat.itemframedupe.addon.modules.ItemFrameDupe;

import java.lang.invoke.MethodHandles;

public class ItemFrameDupeAddon extends MeteorAddon {
	public static final Logger LOG = LogManager.getLogger();

	@Override
	public void onInitialize() {
		LOG.info("Initializing Item Frame Dupe Addon.");

		MeteorClient.EVENT_BUS.registerLambdaFactory("widecat.itemframedupe.addon", (lookupInMethod, klass) -> (MethodHandles.Lookup) lookupInMethod.invoke(null, klass, MethodHandles.lookup()));

        Modules.get().add(new ItemFrameDupe());
	}
}
