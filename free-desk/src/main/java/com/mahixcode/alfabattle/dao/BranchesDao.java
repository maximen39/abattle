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
package com.mahixcode.alfabattle.dao;

import com.mahixcode.alfabattle.model.Branches;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * @author maximen39
 */
public interface BranchesDao {

    @Nonnull
    Optional<Branches> getBranches(final long id);
}
