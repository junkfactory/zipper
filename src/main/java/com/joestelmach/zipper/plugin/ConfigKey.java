package com.joestelmach.zipper.plugin;

import java.util.HashMap;
import java.util.Map;

public enum ConfigKey {
  WEB_ROOT("webroot"),
  OUTPUT_DIR("output.dir"),
  LINT_SKIP("lint.skip"),
  LINT_EXCLUDES("lint.exclude"),
  LINT_FAIL_ON_WARNING("lint.failonwarning"),
  LINT_OPTION_PREFIX("lint.option"),
  JS_OPTIMIZE_LEVEL("js.optimize.level"),
  CSS_LINE_BREAK("css.line.break"),
  ASSET_PATH_PREFIX("asset.path.prefix"),
  JS_ASSET_PREFIX("js.asset"),
  CSS_ASSET_PREFIX("css.asset"),
  GZIP("gzip"),
  BUST_CACHE("bust.cache"),
  ENVIRONMENT("environment");
  
  private static final Map<String, ConfigKey> VALUE_MAP;
  
  static {
    VALUE_MAP = new HashMap<String, ConfigKey>();
    for(ConfigKey key:ConfigKey.values()) {
      VALUE_MAP.put(key.getKey(), key);
    }
  }
  
  private String _key;
  
  private ConfigKey(String key) {
    _key = key;
  }
  
  public String getKey() {
    return _key;
  }
}
