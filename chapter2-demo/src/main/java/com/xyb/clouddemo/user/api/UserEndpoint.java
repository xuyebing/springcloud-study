package com.xyb.clouddemo.user.api;

import com.xyb.clouddemo.user.dto.UserDto;
import com.xyb.clouddemo.user.entity.User;
import com.xyb.clouddemo.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yebingxu
 */
@RestController
@RequestMapping("/users")
@Api(value = "UserEndpoint", description = "User management API")
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "get user paging data",
                  notes = "get user paing data",
                  httpMethod = "GET",
                  tags = "user management related API")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "page",
                    value = "which page, start from 0, default 0",
                    dataType = "int",
                    paramType = "query"),
            @ApiImplicitParam(
                    name = "size",
                    value = "records number in each page, default 20",
                    dataType = "int",
                    paramType = "query"),
            @ApiImplicitParam(
                    name = "sort",
                    value = "sort, format: property, property(, ASC|DESC)",
                    dataType = "String",
                    paramType = "query")
    })
    public List<UserDto> findAll(Pageable pageable) {
        Page<User> page = userService.getPage(pageable);
        if (page != null) {
            return page.getContent().stream().map(user -> {
                return new UserDto(user);
            }).collect(Collectors.toList());
        }
        return Collections.EMPTY_LIST;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "get user specific data",
                  notes = "get user specific data",
                  httpMethod = "GET",
                  tags = "User management related API")
    @ApiImplicitParams({
            @ApiImplicitParam(
                    name = "id",
                    value = "user id",
                    dataType = "int",
                    paramType = "path")
    })
    public UserDto detail(@PathVariable Long id) {
        User user = userService.load(id);
        return (user != null) ? new UserDto(user) : null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public UserDto update(@PathVariable Long id, @RequestBody UserDto userDto) {
        userDto.setId(id);
        User user = userService.save(userDto);
        return (user != null) ? new UserDto(user) : null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id) {
        userService.delete(id);
        return true;
    }
}
