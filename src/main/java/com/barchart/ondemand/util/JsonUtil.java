package com.barchart.ondemand.util;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	private static final ObjectMapper json = new ObjectMapper();

	private static Logger log = LoggerFactory.getLogger(JsonUtil.class);

	static {
		json.setSerializationInclusion(Include.NON_NULL);
	}

	public static <T> T fromJson(final Class<T> klaz, final String jsonText) {

		try {
			return json.readValue(jsonText, klaz);
		} catch (JsonParseException e) {
			log.error("failed to parse JSON, e = {}", e);
		} catch (JsonMappingException e) {
			log.error("failed to parse JSON, e = {}", e);
		} catch (IOException e) {
			log.error("failed to parse JSON, e = {}", e);
		}

		log.error("string value = {}", jsonText);

		return null;

	}

	public static String intoJson(final Object instance) {

		try {
			return json.writeValueAsString(instance);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return null;

	}

}
