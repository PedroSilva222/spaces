package com.bleiny.community.domain.core.entity;

import com.bleiny.commons.domain.enity.AggregateRoot;
import com.bleiny.commons.domain.valueobjects.CommunityId;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;


@Getter
@Builder
public class Community extends AggregateRoot<CommunityId> {

    private final String communityName;
    private final String description;
    private final List<Tag> tags;
    private final Long idCommunity;
    private final User userCreator;

    private final String  communityImage;
    private final List<Roles> roles;

    private Integer membersQuantity;

    public void setMembersQuantity(Integer membersQuantity) {
        this.membersQuantity = membersQuantity;
    }

    private final List<Room> rooms;

    public Community(String communityName, String description, List<Tag> tags, Long idCommunity, User userCreator, String communityImage, List<Roles> roles, Integer membersQuantity, List<Room> rooms) {
        this.communityName = communityName;
        this.description = description;
        this.tags = tags;
        this.idCommunity = idCommunity;
        this.userCreator = userCreator;
        this.communityImage = communityImage;
        this.roles = roles;
        this.membersQuantity = membersQuantity;
        this.rooms = rooms;
    }

    public void initiateCreation() {
        this.setId(new CommunityId(UUID.randomUUID()));
    }
}
