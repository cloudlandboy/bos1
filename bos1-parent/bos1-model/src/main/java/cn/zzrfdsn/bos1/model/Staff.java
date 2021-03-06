package cn.zzrfdsn.bos1.model;
// Generated 2019-8-7 18:16:06 by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;

/**
 * 取派员
 */
public class Staff implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String telephone;
	private Character haspda='0';
	private Character deltag='0';
	private String station;
	private String standard;
	private Integer isreal=0;	//标识该条信息是否真实
	private Set<Decidedzone> decidedzones = new HashSet<Decidedzone>(0);

	public Staff() {
	}

	public Staff(String id) {
		this.id = id;
	}

	public Staff(String id, String name, String telephone, Character haspda, Character deltag, String station,
			String standard, Set<Decidedzone> decidedzones) {
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.haspda = haspda;
		this.deltag = deltag;
		this.station = station;
		this.standard = standard;
		this.decidedzones = decidedzones;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Character getHaspda() {
		return this.haspda;
	}

	public void setHaspda(Character haspda) {
		this.haspda = haspda;
	}

	public Character getDeltag() {
		return this.deltag;
	}

	public void setDeltag(Character deltag) {
		this.deltag = deltag;
	}

	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Set<Decidedzone> getDecidedzones() {
		return this.decidedzones;
	}

	public void setDecidedzones(Set<Decidedzone> decidedzones) {
		this.decidedzones = decidedzones;
	}

	public Integer getIsreal() {
		return isreal;
	}

	public void setIsreal(Integer isreal) {
		this.isreal = isreal;
	}

	
	

}
