package com.apress.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * 
 * @goal hello
 */
public class HelloMojo extends AbstractMojo{

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Hello Maven Plugin");
	}
	
}
