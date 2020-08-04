package com.ouyangxizhu.config;

import com.ouyangxizhu.importselector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyImportSelector.class})
public class MainConfigImportSelector {
}
