package com.example.Music_play.mapper;

import com.example.Music_play.model.Category;
import com.example.Music_play.model.Favourite;
import com.example.Music_play.model.Song;
import com.example.Music_play.model.User;
import com.example.Music_play.modelDTO.CategoryDTO;
import com.example.Music_play.modelDTO.FavouriteDTO;
import com.example.Music_play.modelDTO.SongDTO;
import com.example.Music_play.modelDTO.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-27T12:43:52+0700",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class FavouriteMapperImpl implements FavouriteMapper {

    @Override
    public FavouriteDTO getListFavorite(Favourite favourite) {
        if ( favourite == null ) {
            return null;
        }

        FavouriteDTO favouriteDTO = new FavouriteDTO();

        favouriteDTO.setId( favourite.getId() );
        favouriteDTO.setSong( songToSongDTO( favourite.getSong() ) );
        favouriteDTO.setUser( userToUserDTO( favourite.getUser() ) );

        return favouriteDTO;
    }

    @Override
    public List<FavouriteDTO> getListFavorite(List<Favourite> favourites) {
        if ( favourites == null ) {
            return null;
        }

        List<FavouriteDTO> list = new ArrayList<FavouriteDTO>( favourites.size() );
        for ( Favourite favourite : favourites ) {
            list.add( getListFavorite( favourite ) );
        }

        return list;
    }

    protected CategoryDTO categoryToCategoryDTO(Category category) {
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

    protected SongDTO songToSongDTO(Song song) {
        if ( song == null ) {
            return null;
        }

        SongDTO songDTO = new SongDTO();

        songDTO.setId( song.getId() );
        songDTO.setName( song.getName() );
        songDTO.setAuthor( song.getAuthor() );
        songDTO.setSinger( song.getSinger() );
        songDTO.setLink( song.getLink() );
        songDTO.setImage( song.getImage() );
        songDTO.setCategory( categoryToCategoryDTO( song.getCategory() ) );

        return songDTO;
    }

    protected UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setPhone( user.getPhone() );
        userDTO.setFirst_name( user.getFirst_name() );
        userDTO.setLast_name( user.getLast_name() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setRole( user.getRole() );

        return userDTO;
    }
}
