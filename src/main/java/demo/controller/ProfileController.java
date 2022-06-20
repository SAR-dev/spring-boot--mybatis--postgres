package demo.controller;

import demo.mapper.ProfileMapper;
import demo.model.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    private ProfileMapper profileMapper;

    public ProfileController(ProfileMapper profileMapper) {
        this.profileMapper = profileMapper;
    }

    @PostMapping("/")
    public void addProfile(@RequestBody Profile profile) {
        profileMapper.addProfile(profile);
    }

    @GetMapping("/all")
    public List<Profile> getAllProfiles() {
        return profileMapper.getAllProfiles();
    }

    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable Number id) {
        return profileMapper.getProfile(id);
    }

}
