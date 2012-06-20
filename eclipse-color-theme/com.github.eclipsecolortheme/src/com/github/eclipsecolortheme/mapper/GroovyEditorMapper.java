package com.github.eclipsecolortheme.mapper;

import java.util.Map;

import com.github.eclipsecolortheme.ColorThemeSetting;

public class GroovyEditorMapper extends GenericMapper {

	@Override
	public void map(Map<String, ColorThemeSetting> theme) {
		preferences.putBoolean("groovy.editor.groovyDoc.tag.enabled", true);
    	preferences.putBoolean("groovy.editor.groovyDoc.keyword.enabled", true);
    	preferences.putBoolean("groovy.editor.groovyDoc.link.enabled", true);
		super.map(theme);
	}
	
}