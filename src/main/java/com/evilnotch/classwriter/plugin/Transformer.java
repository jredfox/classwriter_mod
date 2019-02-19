package com.evilnotch.classwriter.plugin;

import java.util.ArrayList;
import java.util.List;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

import com.evilnotch.classwriter.MCWriter;
import com.evilnotch.lib.asm.ConfigCore;
import com.evilnotch.lib.asm.util.ComputeClassWriter;

import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraft.launchwrapper.Launch;

public class Transformer implements IClassTransformer{
    
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass)
    {
    	if(basicClass == null)
    		return null;
    	else if(!containsDomain(transformedName) && !containsClass(transformedName))
    		return basicClass;
    	
    	if(transformedName.endsWith("Minecraft"))
    	{
    		System.out.println("LastIndex:" + Launch.classLoader.getTransformers().get(Launch.classLoader.getTransformers().size()-2));
    	}
    	System.out.println("debug:" + transformedName + ",obName:" + name);
    	MCWriter.resourceCache.put(transformedName, new ClassReader(basicClass));
        return basicClass;
    }

	public boolean containsClass(String transformedName) 
	{
		return MCWriter.resoureClasses.contains(transformedName);
	}

	public static boolean containsDomain(String transformedName) 
	{
		for(String s : MCWriter.resourceDomains)
			if(transformedName.startsWith(s))
				return true;
		return false;
	}

}
