/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.huawei.push.message;

import com.alibaba.fastjson.annotation.JSONField;
import com.huawei.push.util.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;

public class Review {
    @JSONField(name = "reviewer")
    private String reviewer;

    @JSONField(name = "type")
    private Integer type;

    @JSONField(name = "result")
    private Object result;

    public void check() {
        ValidatorUtils.checkArgument(StringUtils.isNotEmpty(this.reviewer), "reviewer should not be empty");
        ValidatorUtils.checkArgument(type != null, "type should not be empty");
        ValidatorUtils.checkArgument(result != null, "result should not be empty");
    }

    public Review() {
    }

    public Review(String reviewer, Integer type, Object result) {
        this.reviewer = reviewer;
        this.type = type;
        this.result = result;
    }

    private Review(Builder builder) {
        this.reviewer = builder.reviewer;
        this.type = builder.type;
        this.result = builder.result;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    // Builder class
    public static class Builder {
        private String reviewer;
        private Integer type;
        private Object result;

        public Builder() {
        }

        public Review.Builder setReviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }

        public Review.Builder setType(Integer type) {
            this.type = type;
            return this;
        }

        public Review.Builder setResult(Object result) {
            this.result = result;
            return this;
        }

        public Review build() {
            return new Review(this);
        }
    }
}
