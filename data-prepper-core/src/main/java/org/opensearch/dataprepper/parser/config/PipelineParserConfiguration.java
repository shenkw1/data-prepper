/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.parser.config;

import com.amazon.dataprepper.model.plugin.PluginFactory;
import org.opensearch.dataprepper.parser.PipelineParser;
import org.opensearch.dataprepper.peerforwarder.PeerForwarder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PipelineParserConfiguration {

    @Bean
    public PipelineParser pipelineParser(
            final DataPrepperArgs dataPrepperArgs,
            final PluginFactory pluginFactory,
            final PeerForwarder peerForwarder
            ) {
        return new PipelineParser(dataPrepperArgs.getPipelineConfigFileLocation(),
                pluginFactory,
                peerForwarder);
    }
}