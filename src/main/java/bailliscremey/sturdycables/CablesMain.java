package bailliscremey.sturdycables;
//main class for Cables Mod

@Mod(modid="SturdyCables", version="0.0.0")
public class Main
{
public static String MODID = "SturdyCables";
public static String VERSION = "0.0.0";

@SidedProxy(clientSide="bailliscremey.sturdycables.ClientProxy", serverSide="bailliscremey.sturdycables.ServerProxy")
public static CommonProxy proxy;

@EventHandler
public void preInit(FMLPreInitializationEvent e)
{
    
}

@EventHandler
public void init(FMLInitializationEvent e)
{
}

@EventHandler
public void postInit(FMLPostInitializationEvent e)
{
}
}
