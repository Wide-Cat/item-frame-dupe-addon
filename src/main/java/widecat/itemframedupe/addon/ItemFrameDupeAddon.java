package widecat.itemframedupe.addon;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import widecat.itemframedupe.addon.modules.ItemFrameDupe;


public class ItemFrameDupeAddon extends MeteorAddon {
	public static final Logger LOG = LogManager.getLogger();

	@Override
	public void onInitialize() {
		LOG.info("Initializing Item Frame Dupe Addon.");

        Modules.get().add(new ItemFrameDupe());
	}

    @Override
    public String getPackage() {
        return "widecat.itemframedupe.addon";
    }
}
