package demo.mapper;

import demo.model.Profile;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProfileMapper {

    @Select("select * from profile")
    List<Profile> getAllProfiles();

    @Insert("insert into profile(firstName, lastName, employeeId, gender, department, currentStatus) values(#{firstName}, #{lastName}, #{employeeId}, #{gender}, #{department}, #{currentStatus})")
    void addProfile(Profile profile);

    @Select("select * from profile where id = #{id}")
    Profile getProfile(Number id);
}
