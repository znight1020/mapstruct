/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._3708;

import org.mapstruct.BeanMapping;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ap.test.bugs._3708.dto.PartnerDto;
import org.mapstruct.ap.test.bugs._3708.entity.Partner;
import org.mapstruct.factory.Mappers;

/**
 * Method-level TARGET_IMMUTABLE override
 */
@Mapper
public interface Issue3708TargetImmutableMapper {
    Issue3708TargetImmutableMapper INSTANCE = Mappers.getMapper( Issue3708TargetImmutableMapper.class );

    @BeanMapping(
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        collectionMappingStrategy = CollectionMappingStrategy.TARGET_IMMUTABLE
    )
    void partialUpdate(@MappingTarget Partner entity, PartnerDto dto);
}
