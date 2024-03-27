package com.example.Music_play.mapper;

import com.example.Music_play.model.Category;
import com.example.Music_play.modelDTO.CategoryDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-27T12:20:10+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO getListCategory(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO categoryDTO = new CategoryDTO();

        categoryDTO.setId( category.getId() );
        categoryDTO.setName( category.getName() );
        categoryDTO.setImage( category.getImage() );
        categoryDTO.setDescription( category.getDescription() );

        return categoryDTO;
    }

    @Override
    public List<CategoryDTO> getListCategory(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryDTO> list = new ArrayList<CategoryDTO>( categories.size() );
        for ( Category category : categories ) {
            list.add( getListCategory( category ) );
        }

        return list;
    }
}
