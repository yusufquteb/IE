$(function () {
    var games = ["abrams'law", "ablock", "abreuvoir", "absolute blocking", "absolute block system", "absorbing boom", "absorbing well", "absorption bed", "absolute stop", "absorption trench", "Abt track", "abutment", "absorption field", "access", "accent lighting", "accretion", "acoustical treatment",
        "active earth pressure", "active sludge", "aerofilter", "anchor", "anchor plate", "backflow", "backfill", "ballast", "buttress", "barrage", "bearing wall", "bearing", "bed joint", "bent", "bond", "borrow", "bridge", "cable-stayed bridge", "cadastral survey", "caisson", "caisson foundation", "cantilever bridge", "cantilever footing", "cantilever retaining wall", "catchwater", "caterpillar gate", "check dam", "Chicago caisson", "chord", "chute spillway", "composite pile", "compressive member", "concrete beam", "concrete bridge", "curb", "curing", "dam", "damp course", "dead rail", "debris dam", "dead track", "deck", "decking", "deep well", "degree of curve", "deformed bar", "demolition", "departure track", "detector bar", "detritus tank", "dike", "digested sludge", "direct bearing", "discharging arch", "distribution reservoir", "ditch", "divergent die", "divergent nozzle", "diverging duct", "diversion canal", "diversion chamber", "diversion dam", "dog's tooth", "drainage", "drainage canal", "drainage gallery", "drainage well", "drilled caisson", "driven caisson", "drum gate", "drop spillway", "drop vent", "dynamic load", "earth pressure", "earthwork", "easement", "easement curve", "earth dam", "elastic design", "embankment", "end-bearing pile", "enrockment", "entrance", "equalizing reservoir", "erection", "excavation", "expansion rollers", "expressway", "facework", "facing", "facing-point lock", "facing wall", "false bottom", "false header", "falsework", "feeder canal", "fell system", "feder", "fink truss", "fire load", "fish plate", "fixed-end beam", "fixed mooring berth", "fixed bridge", "fixture", "flagman", "flashboard", "flat-crested weir", "flat yard", "flexible pavement", "floating foundation", "flood control", "flood dam", "flushing", "footing", "formwork", "foundation", "geomembrane", "geosynthetic", "geotechnics", "gerber beam", "girder", "Gordon's formula", "grade", "grade beam", "grade crossing", "grade line", "gravity dam", "grease trap", "grillage", "grit chamber", "ground block", "ground ways", "gunite", "apguide post", "gusset", "gusset plate", "half-through arch", "hard beach", "hangar", "hanging scaffold", "header", "header bond", "header course", "heart bond", "heading", "heating load", "heating plant", "heel plate", "highway", "hinged arch", "hump yard", "hydraulic engineering", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
    ];

    $("#autocomplete").autocomplete({
        source: games
    });

});


function changed(){
var inp = document.getElementById("autocomplete");
    var out = document.getElementById("outp");
if (inp.value == "ablock") 
    {
    out.innerHTML = "A hollow concrete masonry block with one end closed and the other open and with a web between, so that when the block or shaped into a disk to be rotated by an arbor is laid in a wall two cells are produced";
  
}
else if (inp.value == "abrams'law") {
    out.innerHTML = "In concrete maaterials strength of concrete is determined by the ratio of the cement ";

    }
else if (inp.value == "") {
    out.innerHTML = "";

}
else if (inp.value == "abreuvoir") {
    out.innerHTML = "A space between stones in masonry to be filled with mortar. ";

}
else if (inp.value == "absolute blocking") {
    out.innerHTML = "A control arrangement for rail traffic in which a track is dividedinto sections or blocks upon which a train may not enter until the preceding train has left";

}
else if (inp.value == "absolute block system") {
    out.innerHTML = "A block system in which only a single railroad train is permitted within a block section during a given period of time.";

}
else if (inp.value == "absorbing boom") {
    out.innerHTML = "A device that floatson the water and is used to stop the spread of an oil spill and aid in its removal.";

}
else if (inp.value == "absorbing well") {
    out.innerHTML = "A shaft that permits water to drain through an impermeable stratum to a permeable stratum.";

    }
else if (inp.value == "absorption bed") {
    out.innerHTML = "A sizable pit containing coarse aggregate about a distribution pipe system absorbs the effluent of a septic tank.";

    }

else if (inp.value == "absolute stop") {
    out.innerHTML = "A railway signal which indicates that the train must make a full stopand not proceed until there is a change in the signal.Also known as stop and stay. ";

}
else if (inp.value == "abt track") {
    out.innerHTML = "One of the cogged rails used for railroad tracking in   mountains and so arranged that the cogs are not opposite one an other on any pair of rails.";

}
else if (inp.value == "absorption trench") {
    out.innerHTML = "A trench containing coarse aggregate about a distribution tile pipe through which septic - tank effluent maymove beneath earth.";

}
else if (inp.value == "abutment") {
    out.innerHTML = "A surface or mass provided to withstand thrust for example, end supports of an arch or a bridge.";

}
else if (inp.value == "absorption field") {
    out.innerHTML = "Trenches containing coarse aggregate about distribution pipes permitting septic - tank effluent to seep into surrounding soil.Also known as disposal field.";

}
else if (inp.value == "access") {
    out.innerHTML = "Freedom, ability, or the legal right to pass without obstruction from a given point on earth to some other objective, such as the sea or a public highway.";

}
else if (inp.value == "accent lighting") {
    out.innerHTML = "Directional lighting which highlights an object or attracts attention to a particular area.";

}
else if (inp.value == "accretion") {
    out.innerHTML = "Artificial buildup of land due to the construction of a groin, breakwater, dam,or beach fill.";

} else if (inp.value == "acoustical treatment") {
    out.innerHTML = "That part of building planning that is designed to provide a proper acoustical environment; includes the use of acoustical material. ";

}
else if (inp.value == "active earth pressure") {
    out.innerHTML = "The horizontal pressure that an earth mass exerts on a wall.";

}
else if (inp.value == "active sludge") {
    out.innerHTML = "A sludge rich in destructive bacteria used to break down raw sewage.";

}
else if (inp.value == "aerofilter") {
    out.innerHTML = "A filter bed for sewage treatment consisting of coarse material and operated at high speed, often with recirculation ";

}
else if (inp.value == "anchor") {
    out.innerHTML = "A device connecting a structure to a heavy masonry or concrete object to a a metal plate or to the ground to hold the structure in place.";

}
else if (inp.value == "anchor plate") {
    out.innerHTML = "A metal or wooden plate fastened to or embedded in a support, such as a floor, and used to hold a supporting cable firmly.";

}
else if (inp.value == "backflow") {
    out.innerHTML = "The flow of water or other liquids, mixtures, or substances into the distributing pipes of a potable supply of water from any other than its intended source. ";

}
else if (inp.value == "backfill") {
    out.innerHTML = "Earth refilling a trench or an excavation around a building, bridge abutment, and the like.";

}
else if (inp.value == "ballast") {
    out.innerHTML = "Crushed stone used in a rail road bed to support the ties, hold the track in line, and help drainage. ";

}
else if (inp.value == "buttress") {
    out.innerHTML = "A pier constructed at right angles to a restraining wall on the side opposite to the restrained material; increases the strength and thrust resistance of the wall.";

}
else if (inp.value == "barrage") {
    out.innerHTML = "An artificial dam which increases the depth of water of a river or water course, or diverts it into a channel for navigation.";

}
else if (inp.value == "bearing wall") {
    out.innerHTML = "A wall capable of supporting an imposed load. Also known as structural wall.";

}
else if (inp.value == "bearing") {
    out.innerHTML = "That portion of a beam, truss,or other structural member which rests on the supports.";

}
else if (inp.value == "bed joint") {
    out.innerHTML = "1. A horizontal layer of mortar on which masonry units are laid. 2. One of the radial joints in an arch.";

}
else if (inp.value == "bent") {
    out.innerHTML = "A framework support transverseto the length of a structure.";

}
else if (inp.value == "bond") {
    out.innerHTML = "A piece of building material that serves to unite or bond, such as an arrangement of masonry units.";

}
else if (inp.value == "borrow") {
    out.innerHTML = "Earth material such as sand and gravel that is taken from one location to be used as fill at another.";

}
else if (inp.value == "bridge") {
    out.innerHTML = "A structure erected to span natural or artificial obstacles, such as rivers, highways, or railroads, and supporting a footloose path or roadway for pedestrian, highway, or rail road traffic.";

}
else if (inp.value == "cable-stayed bridge") {
    out.innerHTML = "A modification of the cantilever bridge consisting of girders or trusses cantilevered both ways from a central tower and supported by inclined cables attached to the tower at top or sometimes at several levels.";

}
else if (inp.value == "cadastral survey") {
    out.innerHTML = "A survey made to establish property lines.";

}
else if (inp.value == "caisson") {
    out.innerHTML = "1. A watertight, cylindrical or rectangular chamber used in underwater construction to protect workers from water pressure and soil collapse. 2. A float used to raise a sunken vessel. 3. See dry - dock caisson.";

}
else if (inp.value == "caisson foundation") {
    out.innerHTML = "A shaft of concrete placed under a building column or wall extending down to hardpan or rock.Also known as pier foundation.";

}
else if (inp.value == "canal") {
    out.innerHTML = "An artificial open waterway used for transportation, waterpower, or irrigation. A groove on the underside of a corona.";

    }
else if (inp.value == "cantilever bridge") {
    out.innerHTML = "A fixed bridge con sisting of two spans projecting toward each other and joined at their ends by a suspended simple span.";

}
else if (inp.value == "cantilever footing") {
    out.innerHTML = "A footing used to carry a load from two columns, with one column and one end of the footing placed against a building line or exterior wall.";

}
else if (inp.value == "cantilever retaining wall") {
    out.innerHTML = "A type of wall formed of three cantilever beams: stem, toe projection, and heel projection.";

}
else if (inp.value == "catchwater") {
    out.innerHTML = "A ditch for catching water on sloping land";

}
else if (inp.value == "caterpillar gate") {
    out.innerHTML = "A steel gate carried on crawler tracks that is used to control water flow through a spillway.";

}
else if (inp.value == "check dam") {
    out.innerHTML = "A low, fixed structure,constructed of timber, loose rock, masonry,concrete, to control water flow in an erodable channel or irrigation canal.";

}
else if (inp.value == "Chicago caisson") {
    out.innerHTML = "A cofferdam about4 feet (1.2 meters) in diameter lined with planks and sunk in medium - stiff clays to hard ground for pier foundations.Also known as open - well caisson.";

}
else if (inp.value == "chord") {
    out.innerHTML = "The top or bottom, generally Amerhorizontal member of a truss.";

}
else if (inp.value == "chute spillway") {
    out.innerHTML = "A spillway in which the water flow passes over a crest into a sloping,lined, open channel; used for earth and rock-fill dams.";

}
else if (inp.value == "composite pile") {
    out.innerHTML = "A pile in which the upper and lower portions consist of different types of piles.";

}
else if (inp.value == "compressive member") {
    out.innerHTML = "A structural member subject to tension. ";

}
else if (inp.value == "concrete beam") {
    out.innerHTML = "A structural member of reinforced concrete, placed horizontally over openings to carry loads.";

}
else if (inp.value == "concrete bridge") {
    out.innerHTML = "A bridge constructed of prestressed or reinforced concrete.";

}
else if (inp.value == "curb") {
    out.innerHTML = "A border of concrete or row of capajoined stones forming part of a gutter along a curstreet edge.";

}
else if (inp.value == "curing") {
    out.innerHTML = "A process for bringing freshly placed concrete to required strength and quality by maintaining the humidity and temperature at specified levels for a given period of time. Also known as seasoning";

}
else if (inp.value == "dam") {
    out.innerHTML = "1. A barrier constructed to ob-struct the flow of a watercourse. 2. A pair of anacast -steel plates with interlocking fingers built over an expansion joint in the road surface of a bridge.";

}
else if (inp.value == "damp course") {
    out.innerHTML = "A layer of impervious material placed horizontally in a wall to keep out water.";

}
else if (inp.value == "dead rail") {
    out.innerHTML = " One of two rails on a rail- peroad weighing platform that permit an excessive load to leave the platform.";

}
else if (inp.value == "debris dam") {
    out.innerHTML = "A fixed dam across a stream channel for the retention of sand, gravel, driftwood, or other debris.";

}
else if (inp.value == "dead track") {
    out.innerHTML = "1. Railway track that is no longer used. 2. A section of railway track that is electrically isolated from the track signal circuits.";

}
else if (inp.value == "deck") {
    out.innerHTML = "1. A floor, usually of wood, with-out a roof. 2. The floor or roadway of a bridge.";

}
else if (inp.value == "decking") {
    out.innerHTML = "Surface material on a deck.[ENG] Separating explosive charges containing primers with layers of inert material to prevent passage of concussion.";

}
else if (inp.value == "deep well") {
    out.innerHTML = "A well that draws its water from beneath shallow impermeable strata, at depths exceeding 22 feet(6.7 meters).";

}
else if (inp.value == "degree of curve") {
    out.innerHTML = "A measure of the curvature of a railway or highway, equal to the angle subtended by a 100 - foot(32.8 - meter) chord(railway) or by a 100 - foot arc(highway).";

}
else if (inp.value == "deformed bar") {
    out.innerHTML = "A steel bar with projections or indentations to increase mechanical bonding, used to reinforce concrete.";

}
else if (inp.value == "demolition") {
    out.innerHTML = "The act or process of tearising down a building or other structure.";

}
else if (inp.value == "departure track") {
    out.innerHTML = "A railroad yard track for combining freight cars into outgoing trains.";

}
else if (inp.value == "detector bar") {
    out.innerHTML = "A device that keeps a railroad switch locked while a train is passing over it. detention basin = A reservoir without control gates for storing water over brief periods of time until the stream has the capacity for ordinary flow plus released water; used for flood regulation.";

}
else if (inp.value == "detritus tank") {
    out.innerHTML = "A tank in which heavy detersuspended matter is removed in sewage treatment.";

}
else if (inp.value == "dike") {
    out.innerHTML = " An embankment constructed on dry ground along a riverbank to prevent overflow of lowlands and to retain floodwater.";

}
else if (inp.value == "digested sludge") {
    out.innerHTML = "Sludge or thickened mixture of sewage solids with water that has supbeen decomposed by anaerobic bacteria.";

}
else if (inp.value == "direct bearing") {
    out.innerHTML = "A direct vertical support in a structure. ";

}
else if (inp.value == "discharging arch") {
    out.innerHTML = "A support built over, and not touching, a weak structural member, such as a wooden lintel, to carry the main load.Also known as relieving arch.";

}
else if (inp.value == "distribution reservoir") {
    out.innerHTML = "A service reserwarning voir connected with the conduits of a primary water supply, used to supply water to consumers according to fluctuations in demand over short time periods and serves for local storage in case of emergency.";

}
else if (inp.value == "ditch") {
    out.innerHTML = "1. A small artificial channel cut through earth or rock to carry water for irrigation or drainage. 2. A long narrow cut made in the earth to bury pipeline, cable, or similar installasification.";

}
else if (inp.value == "divergent die") {
    out.innerHTML = "A die with the internal supchannels that lead to the orifice diverging, such as the dies used for manufacture of hollow - body conplastic items.";

}
else if (inp.value == "divergent nozzle") {
    out.innerHTML = "A nozzle whose cross section becomes larger in the direction of flow.";

}
else if (inp.value == "diverging duct") {
    out.innerHTML = "Fluid-flow conduit whose internal cross - sectional area increases in the direction of flow.";

}
else if (inp.value == "diversion canal") {
    out.innerHTML = "An artificial channel for diverting water from one place to another.";

}
else if (inp.value == "diversion chamber") {
    out.innerHTML = "A chamber designed to direct a stream into a channel or channels.";

}
else if (inp.value == "diversion dam") {
    out.innerHTML = "A fixed dam for diverting stream water away from its course.";

}
else if (inp.value == "dog's tooth") {
    out.innerHTML = "A masonry string course in which the brick corner projects.";

}
else if (inp.value == "drainage") {
    out.innerHTML = "Removal of groundwater or surface water, or of water from structures, by gravity or pumping.";

}
else if (inp.value == "drainage canal") {
    out.innerHTML = "An artificial canal built to drain water from an area having no natuaral outlet for precipitation accumulation.";

}
else if (inp.value == "drainage gallery") {
    out.innerHTML = "A gallery in a masonry dam parallel to the top of the dam, to intercept seepage from the upstream face and conduct it away from the downstream face.";

}
else if (inp.value == "drainage well") {
    out.innerHTML = "A vertical shaft in a masonry dam to intercept seepage before it reaches the downstream side.";

}
else if (inp.value == "drilled caisson") {
    out.innerHTML = " A drilled hole filled with concrete and lined with a cylindrical steel casing if needed.";

}
else if (inp.value == "driven caisson") {
    out.innerHTML = "A caisson formed by driving a cylindrical steel shell into the ground with a pile - driving hammer and then placing confeatures crete inside; the shell may be removed when concrete sets.";

}
else if (inp.value == "drum gate") {
    out.innerHTML = "A movable crest gate in the form of an arc hinged at the apex and operated by reservoir pressure to open and close a spillway.";

}
else if (inp.value == "drop spillway") {
    out.innerHTML = " A spillway usually less than 20 feet(6 meters) high having a vertical downstream face, and water drops over the face without touching the face.";

}
else if (inp.value == "drop vent") {
    out.innerHTML = "In a plumbing system, a type of vent that is connected to a drain or vent pipe at a point below the fixture it is serving.";

}
else if (inp.value == "dynamic load") {
    out.innerHTML = "A force exerted by acmoving body on a resisting member, usually in a relatively short time interval.Also known as energy load.";

}
else if (inp.value == "earth pressure") {
    out.innerHTML = "The pressure which exists between earth materials(such as soil or sediments) and a structure(such as a wall).";

}
else if (inp.value == "earthwork") {
    out.innerHTML = "1. Any operation involving the excavation or construction of earth embankearments. 2. Any construction made of earth.";

}
else if (inp.value == "easement") {
    out.innerHTML = "The right held by one pertransducer son over another person's land for a specific use, rights of tenants are excluded.";

}
else if (inp.value == "easement curve") {
    out.innerHTML = "A curve, as on highway, whose degree of curvature is varied to provide a gradual transition between a tangent and a simple curve, or between two simple curves which it connects.Also known as transition curve.";

}
else if (inp.value == "earth dam") {
    out.innerHTML = "A dam having the main section built of earth, sand, or rock, and a core measureof impervious material such as clay or concrete.";

}
else if (inp.value == "elastic design") {
    out.innerHTML = "In the design of a structural member, a method of analysis based on a linear stress - strain relationship, with the assumption that the working stresses constitute only a fraction of the elastic limit of the material.";

}
else if (inp.value == "embankment") {
    out.innerHTML = "1. A ridge constructed of earth, stone, or other material to carry a road way or railroad at a level above that of the surrounding terrain. 2. A ridge of earth or stone to prevent water from passing beyond desirable limits.Also known as bank.";

}
else if (inp.value == "end-bearing pile") {
    out.innerHTML = "A bearing pile that is driven down to hard ground so that it carries the full load at its point.Also known as a pointemery bearing pile.";

}
else if (inp.value == "enrockment") {
    out.innerHTML = "A grouping of large stones dropped into water to form a base, such as for supporting a pier.";

}
else if (inp.value == "entrance") {
    out.innerHTML = "The seaward end of a chananel, harbor, and so on.A place of physical entering, such as a door or passage.";

}
else if (inp.value == "equalizing reservoir") {
    out.innerHTML = " A reservoir cated between a primary water supply and caconsumer for the purpose of maintaining equilibrium between different portions of the distribution system.";

}
else if (inp.value == "erection") {
    out.innerHTML = "Positioning and fixing the frame of a structure.";

}
else if (inp.value == "excavation") {
    out.innerHTML = "1. The process of digging a hollow in the earth. 2. An uncovered cavity in the ground.";

}
else if (inp.value == "expansion rollers") {
    out.innerHTML = "Rollers fitted to one support of a bridge or truss to allow for thermal expansion and contraction.";

}
else if (inp.value == "expressway") {
    out.innerHTML = "A limited-access, high-speed, divided highway having grade separations at points of intersection with other roads.Also known as limited - access highway.";

}
else if (inp.value == "facework") {
    out.innerHTML = "Ornamental or otherwise special material on the front side or outside a wall.";

}
else if (inp.value == "facing") {
    out.innerHTML = "A covering or casting of some material applied to the outer face of embankments, buildings, and other structures.";

}
else if (inp.value == "facing-point lock") {
    out.innerHTML = "A lock used on railroad track, such as a switch track, which contains a plunger that engages a rod on the switch point to lock the device.";

}
else if (inp.value == "facing wall") {
    out.innerHTML = "Concrete lining against the earth face of an excavation; used instead timber sheeting.";

    }
else if (inp.value == "false bottom") {
    out.innerHTML = "A temporary bottom infaired stalled in a caisson to add to its buoyancy.";

    }
else if (inp.value == "false header") {
    out.innerHTML = "A half brick used to comfairlead plete a visible bond; it is not a header.";

    }
else if (inp.value == "falsework") {
    out.innerHTML = "A temporary support used until the main structure is strong enough to suport itself.";

    }
else if (inp.value == "feeder canal") {
    out.innerHTML = "A canal serving to conduct water to a larger canal.";

    }
else if (inp.value == "fell system") {
    out.innerHTML = "A method of traction intended for steep railroad slopes; a central rail is depengripped between horizontal wheels on the loco- materimotive.";

    }
else if (inp.value == "feder") {
    out.innerHTML = "A timber, cluster of piles,bag of rope placed along dock or bridge pierto prevent damage by docking ships or floating objects.";

    }
else if (inp.value == "fink truss") {
    out.innerHTML = "A symmetrical steel roof truss suitable for spans up to 50 feet (15 meters).";

    }
else if (inp.value == "fire load") {
    out.innerHTML = "The load of combustible material per square foot of floor space. fire - resistant of a structural element, able to resist combustion for a specified time under conditions of standard heat intensity withsprinkler out burning or failing structurally.";

    }
else if (inp.value == "fish plate") {
    out.innerHTML = "One of a pair of steel plates bolted to the sides of a rail or beam joint, to secure the joint.";

    }
else if (inp.value == "fixed-end beam") {
    out.innerHTML = "A beam that is supor ported at both free ends and is restrained against rotation and vertical movement. Also known as built-in beam; encastre beam.";

    }
else if (inp.value == "fixed mooring berth") {
    out.innerHTML = "A marine structure consisting of dolphins for securing a ship and a platform to support cargo-handling equipmolybdenumment.";

    }
else if (inp.value == "fixed bridge") {
    out.innerHTML = "A bridge having permanent horizontal or vertical alignment.";

    }
else if (inp.value == "fixture") {
    out.innerHTML = "An object permanently attached to a structure, such as a light or sink.";

    }
else if (inp.value == "flagman") {
    out.innerHTML = "A range-pole carrier in a surveying party.";

    }
else if (inp.value == "flashboard") {
    out.innerHTML = "A relatively low, temporary barrier constructed of a series of boards along the top of a dam spillway to increase storage capacity.";

    }
else if (inp.value == "flat-crested weir") {
    out.innerHTML = "A type of measuring railweir whose crest is in the horizontal plane and gravength is great compared with the height of water passing over it.";

    }
else if (inp.value == "flat yard") {
    out.innerHTML = "A switchyard in which railweir road cars are moved by locomotives, not by gravity.";

    }
else if (inp.value == "flexible pavement") {
    out.innerHTML = "A road or runway made of bituminous material which has little tensile strength and is therefore flexible.";

    }
else if (inp.value == "floating foundation") {
    out.innerHTML = "1. A reinforced concrete slab that distributes the concentrate load from columns; used on soft soil. 2. A foundation mat several meters below the ground face when it is combined with external walls.";

    }
else if (inp.value == "flood control") {
    out.innerHTML = "Use of levees, walls, reservoirs, floodways, and other means to protect spaceland from water overflow.";

    }
else if (inp.value == "flood dam") {
    out.innerHTML = "A dam for storing floodwater, or for supplying a flood of water.";

    }
else if (inp.value == "flushing") {
    out.innerHTML = "The removal or reduction a permissible level of dissolved or suspended contaminants in an estuary or harbor.";

    }
else if (inp.value == "footing") {
    out.innerHTML = "The widened base or sub structure forming the foundation for a wall or a column.";

    }
else if (inp.value == "formwork") {
    out.innerHTML = "A temporary wooden casing used to contain concrete during its placing and hardening. Also known as shuttering.";

    }
else if (inp.value == "passfoundation") {
    out.innerHTML = "1. The ground that supports a building or other structure. 2. The portion of a structure which transmits the building load to the ground.";

    }
else if (inp.value == "geomembrane") {
    out.innerHTML = "Any impermeablebmembrane (usually made of synthetic polymers used with soils, rock, earth, or other geotechnical material in order to block the migration of fluids.";

    }
else if (inp.value == "geosynthetic") {
    out.innerHTML = "Any synthetic material used in geotechnical engineering, such as geoerates textiles and geomembranes.";

    }
else if (inp.value == "geotechnics") {
    out.innerHTML = "The application of scientific methods and engineering principles to civil engineering problems through acquiring, interpreting, and using knowledge of materials of the crust of the earth.";

    }
else if (inp.value == "gerber beam") {
    out.innerHTML = "A long, straight beam that functions essentially as a cantilevered beam by the insertion of two hinges in alternate spans.";

    }
else if (inp.value == "girder") {
    out.innerHTML = "A large beam made of metal or concrete, and sometimes of wood.";

}
else if (inp.value == "Gordon's formula") {
    out.innerHTML = "An empirical formula which gives the collapsing load of a column in terms of its cross-sectional area, length, and least diameter.";

}
else if (inp.value == "grade") {
    out.innerHTML = "1. To prepare a roadway or other land surface of uniform slope. 2. A surface prepared for the support of rails, a road, or a conduit. 3. The elevation of the finished avsurfaceof an engineering project.";

}
else if (inp.value == "grade beam") {
    out.innerHTML = "A reinforced concrete beam placed directly on the ground to provide the foundation for the superstructure.";

}
else if (inp.value == "grade crossing") {
    out.innerHTML = "The intersection of roadways, railways, pedestrian walks, or combinations of these at grade.";

}
else if (inp.value == "grade line") {
    out.innerHTML = "A line or slope used as a longitudinal reference for a railroad or highway.";

}
else if (inp.value == "gravity dam") {
    out.innerHTML = "A dam which depends on its weight for stability.";

}
else if (inp.value == "grease trap") {
    out.innerHTML = "A trap in a drain or waste pipe to stop grease from entering a sewer system.";

}
else if (inp.value == "grillage") {
    out.innerHTML = "A footing that consists of two or more tiers of closely spaced structural steel beams resting on a concrete block, each tier being at right angles to the one below.";

}
else if (inp.value == "grit chamber") {
    out.innerHTML = "A chamber designed to remove sand, gravel, or other heavy solids that have subsiding velocities or specific gravities substantially greater than those of the organic solids in waste water.";

}
else if (inp.value == "ground block") {
    out.innerHTML = "A pulley fastened to the anchor log which changes a horizontal pull to vertical pull on a wire line.";

}
else if (inp.value == "ground ways") {
    out.innerHTML = "Supports, usually made photodiof heavy timbers, which are placed on the ground mate on either side of the keel of a ship under construction, providing a track for launching, and supporting the sliding ways.Also known asstanding ways.";

}
else if (inp.value == "gunite") {
    out.innerHTML = "A mixture of cement, sand, and water that is sprayed on a surface for repairing portions of existing structures, lining reservoirs, and encasing steel for fireproofing.";

    }
else if (inp.value == "apguide post") {
    out.innerHTML = "A post along a road that bears direction signs or guide boards.";

    }
else if (inp.value == "gusset") {
    out.innerHTML = "A plate that is used to strengthen truss joints.";

    }
else if (inp.value == "gusset plate") {
    out.innerHTML = "A rectangular or triangular steel plate that connects members of a truss.";

    }
else if (inp.value == "half-through arch") {
    out.innerHTML = "A bridge arch having the roadway running through it at an elevation midway between the base and the crown.";

    }
else if (inp.value == "hard beach") {
    out.innerHTML = " A portion of a beach especially prepared with a hard surface extending into the water, employed for the purpose of loading or unloading directly into or from landing ships or landing craft.";

    }
else if (inp.value == "hangar") {
    out.innerHTML = "A building at an airport specially designed in height and width to enable aircraft to be stored or maintained in it.";

}
else if (inp.value == "hanging scaffold") {
    out.innerHTML = "A movable platform suspended by ropes and pulleys; used by workers for above-ground building construction and surmaintenance.";

}
else if (inp.value == "header") {
    out.innerHTML = "A framing beam positioned between trimmers and supported at each end by a tail beam.";

}
else if (inp.value == "header bond") {
    out.innerHTML = "A masonry bond consisting of header courses exclusively.";

}
else if (inp.value == "header course") {
    out.innerHTML = "A masonry course of bricks laid as headers. ";

}
else if (inp.value == "heart bond") {
    out.innerHTML = "A masonry bond in which two header stones meet in the middle of thenwall, their joint being covered by another stone no headers stretch across the wall.";

}
else if (inp.value == "heading") {
    out.innerHTML = "In tunnel construction, one or more small tunnels excavated within a large tunnel cross section that will later be enlarged to full section.";

}
else if (inp.value == "heating load") {
    out.innerHTML = "The quantity of heat per unit time that must be provided to maintain the temperature in a building at a given level.";

}
else if (inp.value == "heating plant") {
    out.innerHTML = "The whole system for an enclosed space. Also known as heating system.";

}
else if (inp.value == "heel plate") {
    out.innerHTML = "A plate at the end of a truss.";

}
else if (inp.value == "highway") {
    out.innerHTML = "A public road where traffic has the right to pass and to which owners of adjacent property have access.";

}
else if (inp.value == "hinged arch") {
    out.innerHTML = "A structure that can rotate at its supports or in the center or at both places.";

}
else if (inp.value == "hump yard") {
    out.innerHTML = "A switch yard in a railway system that has a hump or steep incline down which freight cars can coast to prescheduled locations.Also known as gravity yard.";

}
else if (inp.value == "hydraulic engineering") {
    out.innerHTML = "A branch civil engineering concerned with the design, and construction of sewage disposal plants, waterworks, dams, water-operated power plants";

}
else if (inp.value == "iceapron") {
    out.innerHTML = "A wedge-shaped structure which protects a bridge pier from floating ice.";

}
else if (inp.value == "imposed load") {
    out.innerHTML = "Any load which a structure must sustain, other than the weight of the structure itself.";

}
else if (inp.value == "impound") {
    out.innerHTML = "To collect water for irrigation, flood control, or similar purpose.";

}
else if (inp.value == "impounding reservoir") {
    out.innerHTML = "A reservoir with outlets controlled by gates that release stored surface water as needed in a dry season; may also store water for domestic or industrial use or for flood control. Also known as storage reservoir.";

}
else if (inp.value == "independent footing") {
    out.innerHTML = "A footing that supports a concentrated load, such as a single column.";

}
else if (inp.value == "interchange") {
    out.innerHTML = " A junction of two or more highways at a number of separate levels so that traffic can pass from one highway to another without the crossing at grade of traffic streams.";

}
else if (inp.value == "irrigation") {
    out.innerHTML = "Artificial application of distribution to arable land for agricultural use.";

}
else if (inp.value == "isolated footing") {
    out.innerHTML = " A concrete slab or block under an individual load or column.";

}
else if (inp.value == "jetting") {
    out.innerHTML = "A method of driving piles or well points into sand by using a jet of water to reak the soil.";

}
else if (inp.value == "junction") {
    out.innerHTML = "A point of intersection of roads or highways, especially where one terminates.";

}
else if (inp.value == "joint bar") {
    out.innerHTML = "A rigid steel member used in pairs to join, hold, and align rail ends.";

}
else if (inp.value == "joist") {
    out.innerHTML = "A steel or wood beam providing direct support for a floor.";

}
else if (inp.value == "keying") {
    out.innerHTML = "Establishing a mechanical bond in a construction joint.";

}
else if (inp.value == "key joint") {
    out.innerHTML = "A mortar joint with a level of mercury in the cistern as pressure cave pointing.";

}
else if (inp.value == "king closer") {
    out.innerHTML = "In masonry work, a rectangular brick having one corner cut diagonally to half the end of the brick and used to fill an opening in a course larger than half a brick.";

}
else if (inp.value == "kneeler") {
    out.innerHTML = "In masonry, a stone cut to provide a break in the horizontal-vertical pattern to begin the curve or angle of an arch or vault.";

}
else if (inp.value == "ladder track") {
    out.innerHTML = "A main track that joins successive body tracks in a railroad yard. ";

}
else if (inp.value == "lamella") {
    out.innerHTML = "A thin member made of reintion forced concrete, metal, or wood that is joined with similar members in an overlapping pattern to form an arch or a vault.";

}
else if (inp.value == "lamella arch") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "An arch consisting basically of a series of intersecting skewed arches made up of relatively short straight members two members are bolted, riveted, or welded to a third piece at its center.";

}
else if (inp.value == "land accretion") {
    out.innerHTML = "Gaining land in a wet area, such as a marsh or by the sea, by planting to encourage silt deposition or by dumping dredged materials in the area. Also known as land reclamation.";

}
else if (inp.value == "land drainage") {
    out.innerHTML = "The removal of water from land to improve the soil as a medium growth and a surface for land management operations.";

}
else if (inp.value == "landfill") {
    out.innerHTML = "Disposal of solid waste by burying in layers of earth in low ground.";

}
else if (inp.value == "landing") {
    out.innerHTML = "A place where boats receive move or discharge passengers, freight, and so on.";

}
else if (inp.value == "lattice truss") {
    out.innerHTML = " A truss that resembles latticework because of diagonal placement of members connecting the upper and lower chords.";

}
else if (inp.value == "lattice girder") {
    out.innerHTML = "An open girder, beam,or column built from members joined and braced by intersecting diagonal bars. Also known as open-web girder.";

}
else if (inp.value == "launching") {
    out.innerHTML = "The act or process of floating a ship after only hull construction is completed; in some cases ships are not launched until after all construction is completed.";

}
else if (inp.value == "launching cradle") {
    out.innerHTML = "A framework made of wood to support a vessel during launching from sliding ways.";

}
else if (inp.value == "lead track") {
    out.innerHTML = " A distance measured along a straight railroad track from a switch to a frog";

}
else if (inp.value == "lead curve") {
    out.innerHTML = "The curve in a railroad returnout between the switch and the frog.";

}
else if (inp.value == "ledger") {
    out.innerHTML = "A main horizontal member of formwork, supported on uprights and supporting the soffit of the formwork. ";

}
else if (inp.value == "lip") {
    out.innerHTML = "A parapet placed on the downstream margin of a millrace or apron in order minimize scouring of the river bottom.";

}
else if (inp.value == "lock") {
    out.innerHTML = "CONCR A chamber with gates on both ends connecting two sections of a canal or other waterway, to raise or lower the water level in each section.TE";

}
else if (inp.value == "lock gate") {
    out.innerHTML = "A movable barrier separating the water in an upper or lower section of waterway from that in the lock chamber.";

}
else if (inp.value == "lower chord") {
    out.innerHTML = "The bottom member of a truss.";

}
else if (inp.value == "macadam") {
    out.innerHTML = "Uniformly graded stones consolidated by rolling to form a road surface;may be bound with water or cement, or coated with tar or bitumen.";

}
else if (inp.value == "marine railway") {
    out.innerHTML = "A type of dry dock consisting of a cradle of wood or steel with rollers on which the ship may be hauled out of the water along a fixed inclined track leading up the bank of a waterway.";

}
else if (inp.value == "masonry") {
    out.innerHTML = " A construction of stone or similar materials such as concrete or brick.";

}
else if (inp.value == "marina") {
    out.innerHTML = "A harbor facility for small boats, yachts, and so on, where supplies, repairs and various services are available.";

}
else if (inp.value == "mattress") {
    out.innerHTML = "A woven mat, often of wire and cement blocks, used to prevent erosion , jetties, or river banks.";

}
else if (inp.value == "measured mile") {
    out.innerHTML = "The distance of 1 mile (1609.344 meters), the units of which have been accurately measured and marked.";

}
else if (inp.value == "member") {
    out.innerHTML = "A structural unit such as a wall, column, beam, or tie, or a combination of any of these.";

}
else if (inp.value == "narrow gage") {
    out.innerHTML = "A railway gage narrow than the standard gage of 4 feet 81/2 inches(143.51 centimeters)";

}
else if (inp.value == "needling") {
    out.innerHTML = "uderpinning the upper part of a building with horizontally placed timber or steel beams.";

}
else if (inp.value == "needle beam") {
    out.innerHTML = "A temporary member thrust under a building or a foundation for use underpinning.";

}
else if (inp.value == "neat line") {
    out.innerHTML = "The line defining the limits an aspect of construction, such as an excavation or a wall. Also known as net line.";

}
else if (inp.value == "nonpoint source") {
    out.innerHTML = "A dispersed source stormwater runoff; the water comes from land equadedicated to uses such as agriculture, development, forest, and land fills and enters the surface water system as sheet flow at irregular rates.";

}
else if (inp.value == "nosing") {
    out.innerHTML = " A transnumberverse, horizontal motion of a locomotive that exerts a lateral force on the track.";

}
else if (inp.value == "one-way slab") {
    out.innerHTML = "A concrete slab in which the reinforcing steel runs perpendicular to the supporting beams, that is, one way.";

}
else if (inp.value == "open berth") {
    out.innerHTML = "An anchorage berth in an open roadstead.";

}
else if (inp.value == "outfall") {
    out.innerHTML = "The point at which a sewer or drainage channel discharges to a body of water";

}
else if (inp.value == "overbreak") {
    out.innerHTML = " Rock excavated in excess of the neat lines of a tunnel or cutting. Also known as backbreak.";

}
else if (inp.value == "overlay") {
    out.innerHTML = " A repair topping of asphalt or concrete placed on a worn roadway.";

}
else if (inp.value == "overflow") {
    out.innerHTML = " Any device or structure that conducts excess water or sewage from a conduit or container.";

}
else if (inp.value == "overload") {
    out.innerHTML = " A load on a structure that is greater than that for which the structure was designed.";

}
else if (inp.value == "overtopping") {
    out.innerHTML = "The flow of water over a dam or embankment.";

}
else if (inp.value == "overturning") {
    out.innerHTML = "Failure of a retaining wall caused by the soil pressure overcoming the stability of the structure. overrun";

}
else if (inp.value == "overrun") {
    out.innerHTML = "A cleared area extending beyond the end of a runway";

}
else if (inp.value == "panel length") {
    out.innerHTML = " The distance between adjacent joints on a truss, measured along the upper or lower chord.";

}
else if (inp.value == "panel cooling") {
    out.innerHTML = "A system in which the refle absorbing units are in the ceiling, floor, or wall panels of the space which is to be cooled.";

}
else if (inp.value == "parging") {
    out.innerHTML = "A thin coating of mortar or deplaster on a brick or stone surface.";

}
else if (inp.value == "parking apron") {
    out.innerHTML = "A hard-surfaced area used for parking aircraft.";

}
else if (inp.value == "passive method") {
    out.innerHTML = "A construction method in permafrost areas in which the frozen ground near the structure is not disturbed or altered, and the foundations are provided with additional insulation to prevent thawing of the underlying ground.";

}
else if (inp.value == "pavement") {
    out.innerHTML = "A hard floor of concrete, cabrick,tiles, or other material";

}
else if (inp.value == "Pennsylvania truss") {
    out.innerHTML = "A truss character- maized by subdivided panels, curved top chords on through trusses, and curved bottom chords on deck spans; used on long bridge spans.";

}
else if (inp.value == "penstock") {
    out.innerHTML = "A valve or sluice gate for regulating water or sewage flow.";

}
else if (inp.value == "permissible velocity") {
    out.innerHTML = "The highest velocity at which water is permitted to pass through structure or conduit without excessive damage.";

}
else if (inp.value == "permissive stop") {
    out.innerHTML = " A railway signal indicating the train must stop but can proceed slowly and cautiously after a specified interval, usually 1 minute";

}
else if (inp.value == "perpend") {
    out.innerHTML = "A bondstone that extends completely through a masonry wall and is ex-posed on each side of the wall. ";

}
else if (inp.value == "pilaster") {
    out.innerHTML = "A vertical rectangular architectural member that is structurally a pier and architecturally a column.";

}
else if (inp.value == "pile foundation") {
    out.innerHTML = "A substructure supported on piles.";

}
else if (inp.value == "pillar") {
    out.innerHTML = "A column for supporting part of a structure.";

}
else if (inp.value == "pillar") {
    out.innerHTML = "A column for supporting part of a structure.";

}
else if (inp.value == "pilot channel") {
    out.innerHTML = " One of a series of cutoffs for converting a meandering stream into straight channel of greater slope.";

}
else if (inp.value == "pipe pile") {
    out.innerHTML = "A steel pipe 6.30 inches(15.76 centimeters) in diameter, usually filled with concrete and used for underpinning.";

}
else if (inp.value == "pivot bridge") {
    out.innerHTML = "A bridge in which a span muzzle of the can open by pivoting about a vertical axis.";

}
else if (inp.value == "plumbing") {
    out.innerHTML = "The system of pipes and fixtures concerned with the introduction, distribution, and disposal of water in a building.";

}
else if (inp.value == "polder") {
    out.innerHTML = "Land reclaimed from the sea or other body of water by the construction of an embankment to restrain the water.";

}
else if (inp.value == "propped cantilever") {
    out.innerHTML = "A beam having one built-in support and one simple support.";

}
else if (inp.value == "quarantine anchorage") {
    out.innerHTML = "An area where a vessel anchors when satisfying quarantine regulations.";

}
else if (inp.value == "quay") {
    out.innerHTML = " A solid embankment or structure parallel to a waterway; used for loading and unloading ships.";

}
else if (inp.value == "queen closer") {
    out.innerHTML = "In masonry work, a brick that has been cut in half along its length and is used at the end of a course. ";

}
else if (inp.value == "queen post") {
    out.innerHTML = "Either of two vertical members, one on each side of the apex of a triangular truss.";

}
else if (inp.value == "rack") {
    out.innerHTML = "A fixed screen composed of parallel bars placed in a waterway to catch debris.";

}
else if (inp.value == "racking") {
    out.innerHTML = " Setting back the end of each automatic of brick or stone from the end of the preceding course.";

}
else if (inp.value == "rack railway") {
    out.innerHTML = "A railway with a rack between the rails which engages a gear on the locomotive; used on steep grades.railing";

}
else if (inp.value == "railing") {
    out.innerHTML = "A barrier consisting of a rail and supports.";

}
else if (inp.value == "raft foundation") {
    out.innerHTML = "A continuous footing that supports an entire structure, such as a floor. Also known as foundation mat.railroad";

}
  else if (inp.value == "railroad") {
    out.innerHTML = "A permanent line of rails forming a route for freight cars and passenger cars drawn by locomotives.";

}
else if (inp.value == "Ranney well") {
    out.innerHTML = "A well that has a center cacaisson with horizontal perforated pipes extending radially into an aquifer; particularly applicable to the development of thin aquifers shallow depths.";

}
else if (inp.value == "raw sewage") {
    out.innerHTML = " Untreated waste materials";

}
else if (inp.value == "rebar") {
    out.innerHTML = "A steel bar or rod used to reinforce concrete. ";

}
else if (inp.value == "reclamation") {
    out.innerHTML = "The recovery of land other natural resource that has been abandoned because of fire, water, or other cause. 2.Reclaiming dry land by irrigation.";

}
else if (inp.value == "rectification") {
    out.innerHTML = "A new alignment to cordeviation of a stream channel or bank.";

}
else if (inp.value == "reinforced beam") {
    out.innerHTML = "A concrete beam provided with steel bars for longitudinal tension reinforcement and sometimes compression forcement and reinforcement against diagonal tension.";

}
else if (inp.value == "reinforced concrete") {
    out.innerHTML = "Concrete cotaining reinforcing steel rods or wire mesh.";

}
else if (inp.value == "reinforcement") {
    out.innerHTML = "Strengthening concrete, plaster, or mortar by embedding steel rods or wire mesh in it.";

}
else if (inp.value == "reservoir") {
    out.innerHTML = "A pond or lake built for storfrom age of water, usually by the construction of a dam across a river.";

}
else if (inp.value == "revetment") {
    out.innerHTML = "A facing made on a soil or rock embankment to prevent scour by weather or water.";

}
else if (inp.value == "riprap") {
    out.innerHTML = "A foundation or revetment in water or on soft ground made of irregularly placed stones or pieces of boulders; used chiefly for river and harbor work, for roadway filling, and on embankments.";

}
else if (inp.value == "roadbed") {
    out.innerHTML = "The earth foundation of a highway or a railroad.";

}
else if (inp.value == "route locking") {
    out.innerHTML = " Electrically locking position switches, movable point frogs, or on the route of a train, after the train has passed a proceed signal. ";

}
else if (inp.value == "rocker bent") {
    out.innerHTML = "A bent used on a bridge span; hinged at one or both ends to provide for the span�s expansion and contraction.";

}
else if (inp.value == "rocking pier") {
    out.innerHTML = "A pier that is hinged to allow for longitudinal expansion or contraction of the bridge.";

}
else if (inp.value == "sand drain") {
    out.innerHTML = " A vertical boring through a clay or silty soil filled with sand or gravel to facilitate drainage.";

}
else if (inp.value == "safe yield") {
    out.innerHTML = "The maximum dependable draft that can be made continuously upon a source of water supply over a given period of time during which the probable driest period, and therefore period of greatest deficiency in water supply, is likely to occur.";

}
else if (inp.value == "sandpit") {
    out.innerHTML = "An excavation dug in sand, especially as a source of sand for construction materials.";

}
else if (inp.value == "sanitation") {
    out.innerHTML = "The act or process of making healthy environmental conditions.";

}
else if (inp.value == "scaffold") {
    out.innerHTML = " A temporary or movable platform supported on the ground or suspended; used for working at considerable heights above the ground. ";

}
else if (inp.value == "screw pile") {
    out.innerHTML = " A pile having a wide helical blade at the foot which is twisted into position,for use in soft ground or other location requiring a large supporting surface.";

}
else if (inp.value == "sea gate") {
    out.innerHTML = "A gate which serves to protect a harbor or tidal basin from the sea, such as one of a pair of supplementary gates at the entrance to a tidal basin exposed to the sea.";

}
else if (inp.value == "section line") {
    out.innerHTML = "A line representing the boundary of a section of land.sector";

}
  else if (inp.value == "sector") {
    out.innerHTML = " A clearly defined area or airspace designated for a particular purpose.";

}
else if (inp.value == "settlement") {
    out.innerHTML = " The gradual downward movement of an engineering structure, due to compression of the soil below the foundation.";

}
else if (inp.value == "settling basin") {
    out.innerHTML = "An artificial trap dembsigned to collect suspended stream sediment before discharge of the stream into a reservoir.";

}
else if (inp.value == "sewer") {
    out.innerHTML = " An underground pipe or open channel in a sewage system for carrying water or sewage to a disposal area. ";

}
else if (inp.value == "shelf angle") {
    out.innerHTML = "A mild steel angle section, riveted or welded to the web of an I beam to support the formwork for hollow tiles or the floor or roof units, or to form a seat for precast concrete.";

}
else if (inp.value == "siding") {
    out.innerHTML = "A short railroad track connected to the main track at one or more points and used to move railroad cars in order to free traffic on the main line or for temporary storage of cars.Also known as sidetrack.";

}
else if (inp.value == "silting") {
    out.innerHTML = "The filling up or raising of the bed of a body of water by depositing silt.";

}
else if (inp.value == "sleeper") {
    out.innerHTML = " A timber, steel, or precast concrete beam placed under rails to hold themat the correct gage.";

}
else if (inp.value == "slab") {
    out.innerHTML = "That part of a reinforced concrete floor, roof, or platform which spans beams, columns, walls, or piers.";

}
else if (inp.value == "slipway") {
    out.innerHTML = "The space in a shipyard where a foundation for launching ways and keel blocks exists and which is occupied by a ship while under construction.";

}
else if (inp.value == "desoffit") {
    out.innerHTML = "The underside of a horizontal structural member, such as a beam or a slab.";

}
else if (inp.value == "spillway apron") {
    out.innerHTML = "A concrete or timber floor at the bottom of a spillway to prevent soil erosion from heavy or turbulent flow.";

}
else if (inp.value == "surspring switch") {
    out.innerHTML = "A railroad switch that contains a spring to return it to the running position after it has been thrown over by trailing wheels moving on the diverging route.";

}
else if (inp.value == "steen") {
    out.innerHTML = "To line an excavation such as a cellar or well with stone, cement, or similar sysmaterial without the use of mortar. ";

}
else if (inp.value == "stiffener") {
    out.innerHTML = "A steel angle or plate attached to a slender beam to prevent its buckling by increasing its stiffness.";

}
else if (inp.value == "storm sewage") {
    out.innerHTML = "Refuse liquids and waste carried by sewers during or following a period of heavy rainfall.";

}
else if (inp.value == "strut") {
    out.innerHTML = "A long structural member of timber or metal, or a bar designed to resist pressure in the direction of its length. ";

}
else if (inp.value == "tabled joint") {
    out.innerHTML = "In cut stonework, a bedjoint formed by a broad, shallow channel in the surface of one stone that fits a corresponding projection of the stone above or below.";

}
else if (inp.value == "Tainter gate") {
    out.innerHTML = "A spillway gate whose face is a section of a cylinder; rotates about horizontal axis on the downstream end of the gate and can be closed under its own weight.Also known as radial gate.";

}
else if (inp.value == "tamper") {
    out.innerHTML = "A ramming device for compacting a granular material such as soil, backfill, or unformed concrete; usually powered by a motor.";

}
else if (inp.value == "tension member") {
    out.innerHTML = "A structural memtemporary ber subject to tensile stress memtemporary";

}
else if (inp.value == "test pit") {
    out.innerHTML = "An open excavation used to obtain soil samples in foundation studies.";

}
else if (inp.value == "tie plate") {
    out.innerHTML = "A metal plate between a rail and a tie to hold the rail in place and reduce wear on the tie";

}
else if (inp.value == "toe") {
    out.innerHTML = "The part of a base of a dam or retaining wall on the side opposite to the retained material.";

}
else if (inp.value == "trafficability") {
    out.innerHTML = "Capability of terrain to bear traffic, or the extent to which the terrain will permit continued movement of any or all types of traffic.";

}
else if (inp.value == "trap") {
    out.innerHTML = "A bend or dip in a soil drain which is always full of water, providing a water seal to prevent odors from entering the building.";

}
else if (inp.value == "tread") {
    out.innerHTML = "1. The horizontal part of a step in a staircase. 2. The distance between two successive risers in a staircase. ";

}
else if (inp.value == "trench shield") {
    out.innerHTML = "A movable shoring coeffitem consisting of steel plates and braces are bolted or welded together; used to support the walls of a trench while work is in progress.";

}
else if (inp.value == "tripper") {
    out.innerHTML = "A device activated by a passing train to work a signal or switch or to apply braketruss";

}
else if (inp.value == "truss") {
    out.innerHTML = "A frame, generally of steel, timber, concrete, or a light alloy, built from members in tension and compression.turning basin";

}
  else if (inp.value == "turning basin") {
    out.innerHTML = "An open area at the end of a canal or narrow waterway to allow boats to turn around.";

}
else if (inp.value == "two-way slab") {
    out.innerHTML = "A concrete slab supported by beams along all four edges and reinexpressed forced with steel bars arranged perpendicularly.";

}
else if (inp.value == "unbonded member") {
    out.innerHTML = "A posttensioned member that is made of prestressed concrete and has the tensioning force applied only against the end anchorages.";

}
else if (inp.value == "uniform mat") {
    out.innerHTML = "A type of foundation , consisting of a reinforced concrete slab of constant thickness, supporting walls, and columns; it is thick, rigid, and strong.";

}
else if (inp.value == "utilidor") {
    out.innerHTML = "An insulated, heated conduit built below the ground surface or supported above the ground surface to protect the contained water, steam, sewage, and fire lines from freezing.";

}
else if (inp.value == "upstream face") {
    out.innerHTML = " The side of a dam nearer the source of water.";

}
else if (inp.value == "urbanization") {
    out.innerHTML = "The state of being or becoming a community with urban characteristics.";

}
else if (inp.value == "colurban renewal") {
    out.innerHTML = "Redevelopment and revitalization of a deteriorated urban community.";

}
else if (inp.value == "ultimate bearing capacity") {
    out.innerHTML = "The load per unit area that will cause failure byrupture of a supporting soil mass. ";

}
else if (inp.value == "uplift pressure") {
    out.innerHTML = "Pressure in an upward direction against the bottom of a structure, as dam, a road slab, or a basement floor. ";

}
else if (inp.value == "vacuum concrete") {
    out.innerHTML = "Concrete poured into a framework that is fitted with a vacuum at to remove water not required for setting of the cement; in this framework, concrete attains its 28-day strength in 10 days and has a 25% higher crushing strength.";

}
else if (inp.value == "vacuum mat") {
    out.innerHTML = "A rigid flat metal screen faced by a linen filter, the back of which is kept under partial vacuum; used to suck out surplus air and water from poured concrete to produce adense, well-shrunk concrete.";

}
else if (inp.value == "viaduct") {
    out.innerHTML = "A bridge structure supported on high towers with short masonry or reinforced concrete arched spans.";

}
else if (inp.value == "vibration puddling") {
    out.innerHTML = "A technique used to achieve proper consolidation of concrete; vibrating machines may be drawn vertically through the cement, or used on the surface, or placed against the form holding the concrete in place. Also known as mechanical puddling.";

}
else if (inp.value == "vibration limit") {
    out.innerHTML = " The amount of time during which fresh concrete remains mobile when subjected to vibration. ";

}
else if (inp.value == "wall coping") {
    out.innerHTML = "The covering course on top of a brick or stone wall.";

}
else if (inp.value == "waler") {
    out.innerHTML = "A horizontal reinforcement utilized to keep newly poured concrete forms from bulging outward. Also spelled whaler. Also known as wale. ";

}
else if (inp.value == "Warren truss") {
    out.innerHTML = "A truss having only sloping members between the top and bottom horizontal members. ";

}
else if (inp.value == "wall spacer") {
    out.innerHTML = " A metal tie that holds a form for poured concrete in position until the circuconcrete has set.";

}
else if (inp.value == "water tower") {
    out.innerHTML = "A tower or standpipe storing water in areas where ordinary water pressure is inadequate for distribution to consumers.";

}
else if (inp.value == "waterway") {
    out.innerHTML = "A channel for the escape or passage of water.";

}
else if (inp.value == "weep hole") {
    out.innerHTML = " A hole in a wood sill, retaining wall, or other structure to allow accumulated water to escape. ";

}
else if (inp.value == "wellpoint") {
    out.innerHTML = "A component of a wellpoint system consisting of a perforated pipe about 4 feet (1.2 meters) long and about 2 inches (5 centimeters) in diameter, equipped with a ball valve, a screen, and a jetting tip.";

}
else if (inp.value == "wharf") {
    out.innerHTML = "A structure of open construction built parallel to the shoreline; used by vessity sels to receive and discharge passengers and cargo.";

}
else if (inp.value == "wicket dam") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
  else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
else if (inp.value == "abutment") {
    out.innerHTML = "CONCRETE";

}
    else if (inp.value == "abutment") {
        out.innerHTML = "CONCRETE";

    }
    else if (inp.value == "abutment") {
        out.innerHTML = "CONCRETE";

    }
    else if (inp.value == "abutment") {
        out.innerHTML = "CONCRETE";

    }
    else if (inp.value == "abutment") {
        out.innerHTML = "CONCRETE";

    }
    else if (inp.value == "abutment") {
        out.innerHTML = "CONCRETE";

    }
    else if (inp.value == "abutment") {
        out.innerHTML = "CONCRETE";

    }

}