/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.lambda.common.config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import org.opensearch.dataprepper.model.types.ByteCount;

import java.time.Duration;

class ThresholdOptionsTest {
    private static final int DEFAULT_EVENT_COUNT = 10;
    private static final String DEFAULT_BYTE_CAPACITY = "3mb";
    private static final Duration DEFAULT_EVENT_TIMEOUT = Duration.ofSeconds(10);

    @Test
    void test_default_byte_capacity_test() {
        assertThat(new ThresholdOptions().getMaximumSize().getBytes(),
                equalTo(ByteCount.parse(DEFAULT_BYTE_CAPACITY).getBytes()));
    }

    @Test
    void test_get_event_collection_duration_test() {
        assertThat(new ThresholdOptions().getEventCollectTimeOut(), equalTo(DEFAULT_EVENT_TIMEOUT));
    }

    @Test
    void test_get_event_count_test() {
        assertThat(new ThresholdOptions().getEventCount(), equalTo(DEFAULT_EVENT_COUNT));
    }
}