package com.chicagomural.mural.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mural_directory")
public class Mural {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="mural_registration_id")
	private Integer muralRegestrationId;
	
	@Column(name="artist_credit")
	private String artistCredit;
	
	@Column(name="artwork_title")
	private String artworkTitle;
	
	@Column(name="media")
	private String media;
	
	@Column(name="year_installed")
	private String yearInstalled;
	
	@Column(name="year_restored")
	private String yearRestored;
	
	@Column(name="location_description")
	private String locationDescription;
	
	@Column(name="street_address")
	private String streetAddress;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="ward")
	private String ward;
	
	@Column(name="community_area_number")
	private String communityAreaNumber;
	
	@Column(name="affiliated_or_commissioning")
	private String affiliatedOrCommissioning;
	
	@Column(name="description_of_artwork")
	private String descriptionOfArtWork;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="point")
	private String point;
	
	public Mural() {}

	public Mural(Integer muralRegestrationId, String artistCredit, String artworkTitle, String media,
			String yearInstalled, String yearRestored, String locationDescription, String streetAddress, String zip,
			String ward, String communityAreaNumber, String affiliatedOrCommissioning, String descriptionOfArtWork,
			String latitude, String longitude, String point) {
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
		this.point = point;
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

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Mural [id=" + id + ", muralRegestrationId=" + muralRegestrationId + ", artistCredit=" + artistCredit
				+ ", artworkTitle=" + artworkTitle + ", media=" + media + ", yearInstalled=" + yearInstalled
				+ ", yearRestored=" + yearRestored + ", locationDescription=" + locationDescription + ", streetAddress="
				+ streetAddress + ", zip=" + zip + ", ward=" + ward + ", communityAreaNumber=" + communityAreaNumber
				+ ", affiliatedOrCommissioning=" + affiliatedOrCommissioning + ", descriptionOfArtWork="
				+ descriptionOfArtWork + ", latitude=" + latitude + ", longitude=" + longitude + ", point=" + point
				+ "]";
	}
	
	


}
