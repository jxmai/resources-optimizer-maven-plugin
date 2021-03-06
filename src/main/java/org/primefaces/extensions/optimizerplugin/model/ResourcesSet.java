/*
 * Copyright 2011-2015 PrimeFaces Extensions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * $Id$
 */

package org.primefaces.extensions.optimizerplugin.model;

import java.io.File;

/**
 * Class representing a resources set configuration.
 *
 * @author Oleg Varaksin (ovaraksin@googlemail.com)
 */
public class ResourcesSet {

    /**
     * Input directory.
     *
     * @parameter
     */
    private File inputDir;

    /**
     * Compilation level.
     *
     * @parameter
     */
    private String compilationLevel;

    /**
     * Warning level.
     *
     * @parameter
     */
    private String warningLevel;

    /**
     * Flag if images referenced in CSS files (size < 32KB) should be converted to data URIs.
     *
     * @parameter
     */
    private boolean useDataUri;

    /**
     * Files to be included. Files selectors follow patterns specified in {@link org.codehaus.plexus.util.DirectoryScanner}.
     *
     * @parameter
     */
    private String[] includes;

    /**
     * Files to be excluded. Files selectors follow patterns specified in {@link org.codehaus.plexus.util.DirectoryScanner}.
     *
     * @parameter
     */
    private String[] excludes;

    /**
     * Configuration for aggregations.
     *
     * @parameter
     */
    private Aggregation[] aggregations;

    /**
     * Configuration for source maps.
     *
     * @parameter
     */
    private SourceMap sourceMap;

    /**
     * Configuration for input JS language mode.
     *
     * @parameter
     */
    private String languageIn;

    /**
     * Configuration for output JS language mode.
     *
     * @parameter
     */
    private String languageOut;

    public File getInputDir() {
        return inputDir;
    }

    public void setInputDir(File inputDir) {
        this.inputDir = inputDir;
    }

    public String getCompilationLevel() {
        return compilationLevel;
    }

    public void setCompilationLevel(String compilationLevel) {
        this.compilationLevel = compilationLevel;
    }

    public String getWarningLevel() {
        return warningLevel;
    }

    public void setWarningLevel(String warningLevel) {
        this.warningLevel = warningLevel;
    }

    public boolean isUseDataUri() {
        return useDataUri;
    }

    public void setUseDataUri(boolean useDataUri) {
        this.useDataUri = useDataUri;
    }

    public String[] getIncludes() {
        return includes;
    }

    public void setIncludes(String[] includes) {
        this.includes = includes;
    }

    public String[] getExcludes() {
        return excludes;
    }

    public void setExcludes(String[] excludes) {
        this.excludes = excludes;
    }

    public Aggregation[] getAggregations() {
        return aggregations;
    }

    public void setAggregations(Aggregation[] aggregations) {
        this.aggregations = aggregations;
    }

    public SourceMap getSourceMap() {
        return sourceMap;
    }

    public void setSourceMap(SourceMap sourceMap) {
        this.sourceMap = sourceMap;
    }

    public String getLanguageIn() {
        return languageIn;
    }

    public void setLanguageIn(String languageIn) {
        this.languageIn = languageIn;
    }

    public String getLanguageOut() {
        return languageOut;
    }

    public void setLanguageOut(String languageOut) {
        this.languageOut = languageOut;
    }
}
