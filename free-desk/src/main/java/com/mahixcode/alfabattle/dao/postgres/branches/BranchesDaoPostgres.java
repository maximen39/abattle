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
package com.mahixcode.alfabattle.dao.postgres.branches;

import com.mahixcode.alfabattle.dao.BranchesDao;
import com.mahixcode.alfabattle.dao.postgres.branches.repository.BranchesRepository;
import com.mahixcode.alfabattle.model.Branches;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * @author maximen39
 */
@Service
@RequiredArgsConstructor
public class BranchesDaoPostgres implements BranchesDao {

    private final BranchesRepository branchesRepository;

    @Nonnull
    public Optional<Branches> getBranches(final long id) {
        return branchesRepository.findById(id);
    }
}
