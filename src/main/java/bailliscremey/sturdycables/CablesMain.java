package bailliscremey.sturdycables;
//main class for Cables Mod

@Mod(modid="SturdyCables", version="0.0.0")
public class Main
{
    public static String MODID = "SturdyCables";
    public static String VERSION = "0.0.0";

    @SidedProxy(clientSide = "bailliscremey.sturdycables.ClientProxy", serverSide = "bailliscremey.sturdycables.ServerProxy")
    public static CommonProxy proxy;

    public static Block cableLV;
    public static Block cableMV;
    public static Block cableHV;
    public static Block powerOutlet;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }

    @EventHandler
    public void     postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }
}
