package com.evilnotch.classwriter.plugin;

import net.minecraft.launchwrapper.IClassTransformer;

public class Transformer implements IClassTransformer{

	@Override
	public byte[] transform(String name, String transformedName, byte[] basicClass) 
	{
		if(transformedName.equals("net.minecraft.client.Minecraft"))
			System.out.println("Helow World");
		return basicClass;
	}

}
