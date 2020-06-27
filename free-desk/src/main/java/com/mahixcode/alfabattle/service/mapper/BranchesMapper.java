/*
 * Copyright (C) 2020 maximen39
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mahixcode.alfabattle.service.mapper;

import com.mahixcode.alfabattle.dto.response.BranchesResponse;
import com.mahixcode.alfabattle.model.Branches;
import lombok.val;

import javax.annotation.Nonnull;

/**
 * @author maximen39
 */
public final class BranchesMapper {

    private BranchesMapper() {
    }

    @Nonnull
    public static BranchesResponse mapBranches(@Nonnull final Branches branches) {
        val response = new BranchesResponse();
        response.setId(branches.getId());
        response.setTitle(branches.getTitle());
        response.setLat(branches.getLat());
        response.setLon(branches.getLon());
        response.setAddress(branches.getAddress());
        return response;
    }
}
