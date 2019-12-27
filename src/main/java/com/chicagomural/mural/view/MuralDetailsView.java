package com.chicagomural.mural.view;

public class MuralDetailsView {
	private Integer id;
	private Integer muralRegestrationId;
	private String artistCredit;
	private String artworkTitle;
	private String media;
	private String yearInstalled;
	private String yearRestored;
	private String locationDescription;
	private String streetAddress;
	private String zip;
	private String ward;
	private String communityAreaNumber;
	private String affiliatedOrCommissioning;
	private String descriptionOfArtWork;
	private String latitude;
	private String longitude;
	
	public MuralDetailsView() {}

	public MuralDetailsView(Integer id, Integer muralRegestrationId, String artistCredit, String artworkTitle,
			String media, String yearInstalled, String yearRestored, String locationDescription, String streetAddress,
			String zip, String ward, String communityAreaNumber, String affiliatedOrCommissioning,
			String descriptionOfArtWork, String latitude, String longitude) {
		this.id = id;
		this.muralRegestrationId = muralRegestrationId;
		this.artistCredit = artistCredit;
		this.artworkTitle = artworkTitle;
		this.media = media;
		this.yearInstalled = yearInstalled;
		this.yearRestored = yearRestored;
		this.locationDescription = locationDescription;
		this.streetAddress = streetAddress;
		this.zip = zip;
		this.ward = ward;
		this.communityAreaNumber = communityAreaNumber;
		this.affiliatedOrCommissioning = affiliatedOrCommissioning;
		this.descriptionOfArtWork = descriptionOfArtWork;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMuralRegestrationId() {
		return muralRegestrationId;
	}

	public void setMuralRegestrationId(Integer muralRegestrationId) {
		this.muralRegestrationId = muralRegestrationId;
	}

	public String getArtistCredit() {
		return artistCredit;
	}

	public void setArtistCredit(String artistCredit) {
		this.artistCredit = artistCredit;
	}

	public String getArtworkTitle() {
		return artworkTitle;
	}

	public void setArtworkTitle(String artworkTitle) {
		this.artworkTitle = artworkTitle;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getYearInstalled() {
		return yearInstalled;
	}

	public void setYearInstalled(String yearInstalled) {
		this.yearInstalled = yearInstalled;
	}

	public String getYearRestored() {
		return yearRestored;
	}

	public void setYearRestored(String yearRestored) {
		this.yearRestored = yearRestored;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getCommunityAreaNumber() {
		return communityAreaNumber;
	}

	public void setCommunityAreaNumber(String communityAreaNumber) {
		this.communityAreaNumber = communityAreaNumber;
	}

	public String getAffiliatedOrCommissioning() {
		return affiliatedOrCommissioning;
	}

	public void setAffiliatedOrCommissioning(String affiliatedOrCommissioning) {
		this.affiliatedOrCommissioning = affiliatedOrCommissioning;
	}

	public String getDescriptionOfArtWork() {
		return descriptionOfArtWork;
	}

	public void setDescriptionOfArtWork(String descriptionOfArtWork) {
		this.descriptionOfArtWork = descriptionOfArtWork;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
}
