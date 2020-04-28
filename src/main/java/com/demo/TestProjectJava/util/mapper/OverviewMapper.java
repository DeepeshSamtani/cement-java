package com.demo.TestProjectJava.util.mapper;

import com.demo.TestProjectJava.dto.OverviewDto;
import com.demo.TestProjectJava.model.Overview;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface OverviewMapper {

    OverviewMapper INSTANCE = Mappers.getMapper(OverviewMapper.class);

    @Mappings({
            @Mapping(target = "cementId", source = "entity.overviewIdentity.cementId"),
            @Mapping(target = "predictionType", source = "entity.overviewIdentity.predictionType"),
            @Mapping(target = "sampleId", source = "entity.overviewIdentity.sampleId"),
            @Mapping(target = "plantId", source = "entity.plantId"),
            @Mapping(target = "predictionValue", source = "entity.predictionValue"),
            @Mapping(target = "actualValue", source = "entity.actualValue"),
            @Mapping(target = "timestamp", source = "entity.timestamp"),
            @Mapping(target = "indicator", source = "entity.indicator"),
            @Mapping(target = "ll", source = "entity.ll"),
            @Mapping(target = "hh", source = "entity.hh")
    })
    OverviewDto overviewToDto(Overview entity);
}
