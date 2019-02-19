package com.evilnotch.classwriter.plugin;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.Name("evilnotch-classwriter-hack")
@IFMLLoadingPlugin.SortingIndex(Integer.MAX_VALUE)
@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.TransformerExclusions("com.evilnotch.classwriter.")
public class FMLCorePlugin implements IFMLLoadingPlugin
{

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
		
	}

	@Override
	public String getAccessTransformerClass() 
	{
		return null;
	}
	
}