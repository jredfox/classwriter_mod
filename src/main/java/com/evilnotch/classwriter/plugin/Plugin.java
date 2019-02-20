package com.evilnotch.classwriter.plugin;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.Name("evilnotch-classwriter")
@IFMLLoadingPlugin.SortingIndex(0)
@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.TransformerExclusions("com.evilnotch.classwriter.")
public class Plugin implements IFMLLoadingPlugin
{
	public static Boolean isObf;

	@Override
	public String[] getASMTransformerClass() 
	{
		return new String[]{"com.evilnotch.classwriter.plugin.Transformer"};
	}

	@Override
	public String getModContainerClass() 
	{
		return null;
	}

	@Override
	public String getSetupClass() 
	{
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) 
	{
		isObf = (Boolean) data.get("runtimeDeobfuscationEnabled");
	}

	@Override
	public String getAccessTransformerClass() 
	{
		return null;
	}
	
}