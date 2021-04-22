//
// SpecialModelName.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct SpecialModelName: Codable, Hashable {

    public var specialPropertyName: Int64?

    public init(specialPropertyName: Int64? = nil) {
        self.specialPropertyName = specialPropertyName
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case specialPropertyName = "$special[property.name]"
    }

}